package com.example.piyushaggarwal.tripmonkey.home.activity.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.networkrequestlib.ApiRequestClass;
import com.example.networkrequestlib.interfaces.VolleyResponseListener;
import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.configuration.UriBuilder;
import com.example.piyushaggarwal.tripmonkey.models.AutoCompleteModel;

public class TripFragmentOne extends Fragment implements VolleyResponseListener {


    public TripFragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trip_fragment_one, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        new ApiRequestClass().apiRequest(this, getActivity(), UriBuilder.getInstance().getAutoCompleteCity(), AutoCompleteModel.class);
    }

    @Override
    public <T> void onVolleySuccessResult(T modelResponse) {

    }

    @Override
    public void onVolleyErrorResult(String errorMessage) {

    }
}
