package com.example.networkrequestlib;

import android.content.Context;
import android.util.Log;

import com.android.volley.Cache;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.example.networkrequestlib.interfaces.VolleyResponseListener;

import java.io.UnsupportedEncodingException;


public class ApiRequestClass {

    public static final String TAG = RequestController.class.getSimpleName();
    private final int socketTimeOut = 2000;//Timeout Time for Request Made Through Volley

    /**
     * @param responseListener - responseListner interface implementing the Presenter in which ypou want callback
     * @param senderContext    - the context of the activity from which request is made
     * @param requestApi       - It is the url of request Api
     * @param modelType
     * @param <T>
     */

    static ApiRequestClass apiRequestClass;

    public static ApiRequestClass getInstance() {
        return apiRequestClass == null ? apiRequestClass = new ApiRequestClass() : apiRequestClass;
    }

    public <T> void apiRequest(final VolleyResponseListener responseListener, Context senderContext, final String requestApi, final Class<T> modelType, final int requestCode) {

        StringRequest strGetReq = new StringRequest(Request.Method.GET, requestApi, new Response.Listener<String>() {
            public void onResponse(String response) {
                Log.d(TAG, response.toString());
                responseListener.onVolleySuccessResult(response, modelType,requestCode);
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "Error: " + error.getMessage());
                responseListener.onVolleyErrorResult(error.getMessage());
            }
        }) {
            @Override
            protected Response<String> parseNetworkResponse(NetworkResponse response) {
                try {
                    Cache.Entry cacheEntry = HttpHeaderParser.parseCacheHeaders(response);
                    if (cacheEntry == null) {
                        cacheEntry = new Cache.Entry();
                    }
                    final long cacheHitButRefreshed = 3 * 60 * 1000; // in 3 minutes cache will be hit, but also refreshed on background
                    final long cacheExpired = 24 * 60 * 60 * 1000; // in 24 hours this cache entry expires completely
                    long now = System.currentTimeMillis();
                    final long softExpire = now + cacheHitButRefreshed;
                    final long ttl = now + cacheExpired;
                    cacheEntry.data = response.data;
                    cacheEntry.softTtl = softExpire;
                    cacheEntry.ttl = ttl;
                    cacheEntry.responseHeaders = response.headers;
                    final String jsonString = new String(response.data,
                            HttpHeaderParser.parseCharset(response.headers));
                    return Response.success(new String(jsonString), cacheEntry);
                } catch (UnsupportedEncodingException e) {
                    return Response.error(new ParseError(e));
                }
            }
        };

        strGetReq.setShouldCache(true);

        int socketTimeout = 20000;//Change it Accordingly
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeout, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        strGetReq.setRetryPolicy(policy);
        RequestController.getInstance(senderContext).addToRequestQueue(strGetReq, modelType.getName());
    }

    public String checkCache(String checkUrl, Context context) {
        Cache cache = RequestController.getInstance(context).getRequestQueue().getCache();
        Cache.Entry entry = cache.get(checkUrl);
        if (entry != null) {
            try {
                String data = new String(entry.data, "UTF-8");
                Log.d(TAG, data);
                return data;
                // handle data, like converting it to xml, json, bitmap etc.,
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "null";
            }
        } else {
            // Cached response doesn't exists. Make network call here
            return "null";
        }
    }

}
