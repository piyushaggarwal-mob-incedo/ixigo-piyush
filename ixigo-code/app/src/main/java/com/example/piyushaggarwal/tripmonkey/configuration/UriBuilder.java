package com.example.piyushaggarwal.tripmonkey.configuration;

import android.net.Uri;

public class UriBuilder {

    static UriBuilder uriBuilder;

    public static UriBuilder getInstance() {
        return uriBuilder == null ? uriBuilder = new UriBuilder() : uriBuilder;
    }

    public String getAutoCompleteCity() {
        Uri.Builder builder = new Uri.Builder();

        builder.scheme("https")
                .authority(Constants.baseUrl)
                .appendPath("action")
                .appendPath("content")
                .appendPath("zeus")
                .appendPath("autocomplete")
                .appendPath("content")
                .appendQueryParameter("searchFor", "tpAutoComplete")
                .appendQueryParameter("neCategories", "City")
                .appendQueryParameter("query", "de");


        String myUrl = builder.build().toString();
        return myUrl;
    }
}
