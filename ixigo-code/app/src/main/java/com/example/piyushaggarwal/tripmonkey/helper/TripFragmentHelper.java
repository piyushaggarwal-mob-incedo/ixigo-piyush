package com.example.piyushaggarwal.tripmonkey.helper;

import com.example.piyushaggarwal.tripmonkey.IBasePresenter;
import com.example.piyushaggarwal.tripmonkey.IBaseView;
import com.example.piyushaggarwal.tripmonkey.home.activity.fragments.TripFragment;

public class TripFragmentHelper implements IBaseView, IBasePresenter {

    TripFragment tripFragment;

    public TripFragmentHelper(TripFragment tripFragment) {
        this.tripFragment = tripFragment;
    }

    @Override
    public void showLoader() {

    }

    @Override
    public void hideLoader() {

    }

    @Override
    public void requestData() {

    }

}
