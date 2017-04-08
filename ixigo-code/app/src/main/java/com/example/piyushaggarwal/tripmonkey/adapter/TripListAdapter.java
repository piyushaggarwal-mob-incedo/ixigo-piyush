package com.example.piyushaggarwal.tripmonkey.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.networkrequestlib.models.AutoCompleteCity;
import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.holders.TripViewHolder;
import com.example.piyushaggarwal.tripmonkey.home.activity.activity.HomeActivity;
import com.example.piyushaggarwal.tripmonkey.home.fragments.DetailFragment;


public class TripListAdapter extends RecyclerView.Adapter<TripViewHolder> {

    AutoCompleteCity[] autoCompleteCities;
    Context mContext;

    public TripListAdapter(AutoCompleteCity[] autoCompleteCities, Context mContext) {
        this.autoCompleteCities = autoCompleteCities;
        this.mContext = mContext;
    }

    @Override
    public TripViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new TripViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TripViewHolder holder, int position) {
        holder.getTextView().setText(autoCompleteCities[position].getText());
        if (position % 2 == 0) {
            holder.getTextView().setTextColor(Color.GREEN);
            holder.getCityFloat().setBackgroundTintList(ColorStateList.valueOf(mContext.getResources().getColor(R.color.colorPrimary)));
        }
        if (position % 3 == 0) {
            holder.getTextView().setTextColor(Color.RED);
            holder.getCityFloat().setBackgroundTintList(ColorStateList.valueOf(mContext.getResources().getColor(R.color.gogreen)));

        }

        holder.getLinearLayout().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((HomeActivity) mContext).addFragmentToContainer(new DetailFragment());
            }
        });

    }

    @Override
    public int getItemCount() {
        return autoCompleteCities.length;
    }

}
