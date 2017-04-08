package com.example.piyushaggarwal.tripmonkey.home.fragments;


import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.adapter.TimeLineAdapterOne;
import com.example.piyushaggarwal.tripmonkey.home.activity.activity.HomeActivity;

public class TimeLineFragment extends Fragment {

    RecyclerView timeLineRecyclerView;
    View mView;
    Button submitTimeLine, scoreTimeLine;
    ContentLoadingProgressBar contentLoadingProgressBar;

    public TimeLineFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_time_line, container, false);
        initUi();
        return mView;
    }

    public void initUi() {
        timeLineRecyclerView = (RecyclerView) mView.findViewById(R.id.timelineRecyclerOne);
        scoreTimeLine = (Button) mView.findViewById(R.id.ixigopointbtn);
        submitTimeLine = (Button) mView.findViewById(R.id.submitTimeLine);
        contentLoadingProgressBar = (ContentLoadingProgressBar) mView.findViewById(R.id.loadingbar);
        submitTimeLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contentLoadingProgressBar.setVisibility(View.VISIBLE);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        contentLoadingProgressBar.setVisibility(View.GONE);
                        scoreTimeLine.setText("IXIGO POINTS: 30");
                    }
                }, 2000);
            }
        });

        TimeLineAdapterOne timeLineAdapterOne = new TimeLineAdapterOne(getActivity());
        timeLineRecyclerView.setLayoutManager(getLinearLayoutManager());
        timeLineRecyclerView.setAdapter(timeLineAdapterOne);
    }

    private LinearLayoutManager getLinearLayoutManager() {
        return new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
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
