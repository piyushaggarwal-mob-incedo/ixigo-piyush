package com.example.piyushaggarwal.tripmonkey.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.piyushaggarwal.tripmonkey.R;
import com.github.vipulasri.timelineview.TimelineView;

public class TimeLineViewHolder extends RecyclerView.ViewHolder {
    public TimelineView mTimelineView;
    TextView datetextView, tripTextView;

    public TimeLineViewHolder(View itemView, int viewType) {
        super(itemView);
        mTimelineView = (TimelineView) itemView.findViewById(R.id.time_marker);
        datetextView = (TextView) itemView.findViewById(R.id.text_timeline_date);
        tripTextView = (TextView) itemView.findViewById(R.id.text_timeline_title);
        mTimelineView.initLine(viewType);
    }

    public TimelineView getmTimelineView() {
        return mTimelineView;
    }

    public TextView getDatetextView() {
        return datetextView;
    }

    public TextView getTripTextView() {
        return tripTextView;
    }
}