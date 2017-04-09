package com.example.piyushaggarwal.tripmonkey.holders;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.piyushaggarwal.tripmonkey.R;

public class TripViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    LinearLayout linearLayout;
    FloatingActionButton cityFloat;
    TextView floatText, cityMode, cityTime, greenRoute, fastestRoute;
    ImageView imageView;

    public TripViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.cityTitle);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.itemContainer);
        cityFloat = (FloatingActionButton) itemView.findViewById(R.id.cityFloat);
        floatText = (TextView) itemView.findViewById(R.id.floatText);
        cityMode = (TextView) itemView.findViewById(R.id.cityMode);
        cityTime = (TextView) itemView.findViewById(R.id.cityTime);
        greenRoute = (TextView) itemView.findViewById(R.id.greenRoute);
        fastestRoute = (TextView) itemView.findViewById(R.id.fastestRoute);
        imageView = (ImageView) itemView.findViewById(R.id.cityImage);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public TextView getGreenRoute() {
        return greenRoute;
    }

    public TextView getFastestRoute() {
        return fastestRoute;
    }

    public TextView getCityMode() {
        return cityMode;
    }

    public TextView getCityTime() {
        return cityTime;
    }

    public TextView getFloatText() {
        return floatText;
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