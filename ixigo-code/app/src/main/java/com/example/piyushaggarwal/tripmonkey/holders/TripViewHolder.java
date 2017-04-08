package com.example.piyushaggarwal.tripmonkey.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.piyushaggarwal.tripmonkey.R;

public class TripViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public TripViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.cityTitle);
    }

    public TextView getTextView() {
        return textView;
    }
}