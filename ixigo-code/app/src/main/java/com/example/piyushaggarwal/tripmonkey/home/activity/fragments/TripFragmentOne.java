package com.example.piyushaggarwal.tripmonkey.home.activity.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.networkrequestlib.ApiRequestClass;
import com.example.networkrequestlib.interfaces.VolleyResponseListener;
import com.example.piyushaggarwal.tripmonkey.IBasePresenter;
import com.example.piyushaggarwal.tripmonkey.IBaseView;
import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.configuration.UriBuilder;
import com.example.piyushaggarwal.tripmonkey.core.AbstractBaseFragment;
import com.example.piyushaggarwal.tripmonkey.models.AutoCompleteModel;

public class TripFragmentOne extends AbstractBaseFragment implements VolleyResponseListener, IBasePresenter, IBaseView {


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
        Toast.makeText(getActivity(), modelResponse.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onVolleyErrorResult(String errorMessage) {
        Toast.makeText(getActivity(), errorMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void requestData() {

    }

    @Override
    public void showLoader() {

    }

    @Override
    public void hideLoader() {

    }
}
