package com.example.piyushaggarwal.tripmonkey.holders;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.piyushaggarwal.tripmonkey.R;

public class TripViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    LinearLayout linearLayout;
    FloatingActionButton cityFloat;

    public TripViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.cityTitle);
        linearLayout=(LinearLayout)itemView.findViewById(R.id.itemContainer);
        cityFloat = (FloatingActionButton)itemView.findViewById(R.id.cityFloat);
    }

    public FloatingActionButton getCityFloat() {
        return cityFloat;
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }

    public TextView getTextView() {
        return textView;
    }
}