package com.example.piyushaggarwal.tripmonkey.configuration;

import android.net.Uri;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UriBuilder {

    static UriBuilder uriBuilder;

    public static UriBuilder getInstance() {
        return uriBuilder == null ? uriBuilder = new UriBuilder() : uriBuilder;
    }

    public String getAutoCompleteCity(String inputText) {
        Uri.Builder builder = new Uri.Builder();

        builder.scheme("http")
                .authority(Constants.baseUrl)
                .appendPath("action")
                .appendPath("content")
                .appendPath("zeus")
                .appendPath("autocomplete")
                .appendPath("content")
                .appendQueryParameter("searchFor", "tpAutoComplete")
                .appendQueryParameter("neCategories", "City")
                .appendQueryParameter("query", inputText);


        String myUrl = builder.build().toString();
        return myUrl;
    }

    public String getARData() {
        Uri.Builder builder = new Uri.Builder();

        builder.scheme("http")
                .authority(Constants.baseUrl_apiar)
                .appendPath("feed")
                .appendPath("geo:51.5033640;-0.1276250/")
                .appendQueryParameter("token", "b24a96dc08e5ea197a908993545a3010a7cd290e");

        String myUrl = builder.build().toString();
        return myUrl;
    }

    public String getCityInterestsAPIData(String apiKey, String type, String skip, String limit) {
        Uri.Builder builder = new Uri.Builder();

        try {
            builder.scheme("http")
                    .authority(Constants.baseUrl)
                    .appendPath("api")
                    .appendPath("v3")
                    .appendPath("namedentities")
                    .appendPath("city")
                    .appendPath("cityid")
                    .appendPath("categories")
                    .appendQueryParameter("apiKey", URLEncoder.encode("ixicode!2$","UTF-8"))
                    .appendQueryParameter("type", "b24a96dc08e5ea197a908993545a3010a7cd290e")
                    .appendQueryParameter("skip", "b24a96dc08e5ea197a908993545a3010a7cd290e")
                    .appendQueryParameter("limit", "b24a96dc08e5ea197a908993545a3010a7cd290e");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String myUrl = builder.build().toString();
        return myUrl;
    }

    public String getRecommendedAPIData(String product, String apiKey) {
        Uri.Builder builder = new Uri.Builder();

        try {
            builder.scheme("http")
                    .authority(Constants.baseUrl)
                    .appendPath("api")
                    .appendPath("v2")
                    .appendPath("widgets")
                    .appendPath("brand")
                    .appendPath("inspire")
                    .appendQueryParameter("product", "b24a96dc08e5ea197a908993545a3010a7cd290e")
                    .appendQueryParameter("apiKey", URLEncoder.encode("ixicode!2$","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String myUrl = builder.build().toString();
        return myUrl;
    }

    public String getEntityDetailAPIData(String apiKey) {
        Uri.Builder builder = new Uri.Builder();

        try {
            builder.scheme("http")
                    .authority(Constants.baseUrl)
                    .appendPath("api")
                    .appendPath("v3")
                    .appendPath("namedentities")
                    .appendPath("id")
                    .appendPath("entityId")
                    .appendQueryParameter("apiKey", URLEncoder.encode("ixicode!2$","UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String myUrl = builder.build().toString();
        return myUrl;
    }


    public String getA2BAPIData(String apiKey, String originCityId, String destinationCityId) {
        Uri.Builder builder = new Uri.Builder();

        try {
            builder.scheme("http")
                    .authority(Constants.baseUrl)
                    .appendPath("api")
                    .appendPath("v2")
                    .appendPath("a2b")
                    .appendPath("modes")
                    .appendQueryParameter("apiKey", URLEncoder.encode("ixicode!2$","UTF-8"))
                    .appendQueryParameter("originCityId", "b24a96dc08e5ea197a908993545a3010a7cd290e")
                    .appendQueryParameter("destinationCityId", "b24a96dc08e5ea197a908993545a3010a7cd290e");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        String myUrl = builder.build().toString();
        return myUrl;
    }


}

