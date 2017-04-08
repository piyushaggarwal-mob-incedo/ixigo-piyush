package com.example.piyushaggarwal.tripmonkey.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.networkrequestlib.models.AutoCompleteCity;
import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.holders.TripViewHolder;


public class TripListAdapter extends RecyclerView.Adapter<TripViewHolder> {

    AutoCompleteCity[] autoCompleteCities;

    public TripListAdapter(AutoCompleteCity[] autoCompleteCities) {
        this.autoCompleteCities = autoCompleteCities;
    }

    @Override
    public TripViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new TripViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TripViewHolder holder, int position) {
        holder.getTextView().setText(autoCompleteCities[position].getText());
        if (position % 2 == 0)
            holder.getTextView().setTextColor(Color.GREEN);
        if (position % 3 == 0)
            holder.getTextView().setTextColor(Color.RED);

    }

    @Override
    public int getItemCount() {
        return autoCompleteCities.length;
    }


}
