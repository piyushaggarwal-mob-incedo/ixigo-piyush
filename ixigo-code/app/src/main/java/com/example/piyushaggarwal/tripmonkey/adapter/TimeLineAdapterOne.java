package com.example.piyushaggarwal.tripmonkey.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.holders.TimeLineViewHolder;
import com.github.vipulasri.timelineview.TimelineView;

/**
 * Created by piyush.aggarwal on 4/9/2017.
 */

public class TimeLineAdapterOne extends RecyclerView.Adapter<TimeLineViewHolder> {

    Context mContext;

    public TimeLineAdapterOne(Context context) {
        mContext = context;
    }

    @Override
    public int getItemViewType(int position) {
        return TimelineView.getTimeLineViewType(position, getItemCount());
    }

    @Override
    public TimeLineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.timeline_layout_one, null);
        return new TimeLineViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(TimeLineViewHolder holder, int position) {
        holder.mTimelineView.setMarker(ContextCompat.getDrawable(mContext, R.drawable.ic_marker), ContextCompat.getColor(mContext, R.color.colorPrimary));
        if (position % 2 == 0) {
            holder.getDatetextView().setText("28 March 2017");
            holder.getTripTextView().setText("Shimla To Delhi/Kanpur to Kolkata");
        }
        if (position % 3 == 0) {
            holder.getDatetextView().setText("28 February 2017");
            holder.getTripTextView().setText("Raipur To Mumbai/Mumbai to Kanpur");
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
