package com.example.piyushaggarwal.tripmonkey.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.networkrequestlib.models.A2BResponseModel;
import com.example.networkrequestlib.models.Routes;
import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.holders.TripViewHolder;
import com.example.piyushaggarwal.tripmonkey.home.activity.activity.HomeActivity;
import com.example.piyushaggarwal.tripmonkey.home.fragments.DetailFragment;


public class TripListAdapter extends RecyclerView.Adapter<TripViewHolder> {

    A2BResponseModel a2BResponseModel;
    Context mContext;
    Routes[] routes;

    public TripListAdapter(A2BResponseModel a2BResponseModel, Context mContext) {
        this.a2BResponseModel = a2BResponseModel;
        routes = a2BResponseModel.getData().getRoutes();
        this.mContext = mContext;
    }

    @Override
    public TripViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new TripViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TripViewHolder holder, int position) {

        holder.getTextView().setText("Price :" + a2BResponseModel.getData().getRoutes()[position].getPrice());
        holder.getCityMode().setText("Mode :" + a2BResponseModel.getData().getRoutes()[position].getModes()[0]);
        holder.getCityTime().setText("Duration :" + a2BResponseModel.getData().getRoutes()[position].getDurationPretty());
        holder.getGreenRoute().setText("Route" + a2BResponseModel.getData().getRoutes()[position].getModeViaString());

        a2BResponseModel.getData().getRoutes()[position].getSteps()[0].getCarriers()[0].getCarrierName();
        if (position % 3 == 1) {
            holder.getFastestRoute().setText("Fastest Route");
            holder.getTextView().setTextColor(Color.RED);
            holder.getCityFloat().setBackgroundTintList(ColorStateList.valueOf(mContext.getResources().getColor(R.color.yellow)));
            holder.getFloatText().setText("73");
            holder.getImageView().setBackgroundResource(R.drawable.plane);
        }
        if (position % 3 == 2) {
            holder.getFastestRoute().setText("Cheapest Route");
            holder.getTextView().setTextColor(Color.GREEN);
            holder.getCityFloat().setBackgroundTintList(ColorStateList.valueOf(mContext.getResources().getColor(R.color.redcolor)));
            holder.getFloatText().setText("46");
            holder.getImageView().setBackgroundResource(R.drawable.car);
        }

        if (position % 3 == 0) {
            holder.getFastestRoute().setText("Green Route");
            holder.getTextView().setTextColor(Color.GREEN);
            holder.getCityFloat().setBackgroundTintList(ColorStateList.valueOf(mContext.getResources().getColor(R.color.gogreen)));
            holder.getFloatText().setText("83");
            holder.getImageView().setBackgroundResource(R.drawable.train);

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
        return routes.length;
    }

}
