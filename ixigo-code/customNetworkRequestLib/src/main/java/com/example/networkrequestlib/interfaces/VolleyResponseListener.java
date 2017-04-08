package com.example.networkrequestlib.interfaces;

public interface VolleyResponseListener {
    <T> void onVolleySuccessResult(T modelResponse);
    void onVolleyErrorResult(String errorMessage);
}

