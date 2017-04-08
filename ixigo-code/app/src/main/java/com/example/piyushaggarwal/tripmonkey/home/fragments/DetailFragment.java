package com.example.piyushaggarwal.tripmonkey.home.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.home.activity.activity.HomeActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        ((HomeActivity) getActivity()).fab.setVisibility(View.GONE);

    }

    @Override
    public void onPause() {
        super.onPause();
        ((HomeActivity) getActivity()).fab.setVisibility(View.VISIBLE);

    }

}
