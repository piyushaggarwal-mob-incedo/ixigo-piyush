package com.example.networkrequestlib.interfaces;

public interface VolleyResponseListener {
    <T> void onVolleySuccessResult(String response, T modelResponse, int requestCode);

    void onVolleyErrorResult(String errorMessage);
}

