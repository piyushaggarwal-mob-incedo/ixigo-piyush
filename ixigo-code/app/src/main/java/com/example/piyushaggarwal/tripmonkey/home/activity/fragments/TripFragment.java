package com.example.piyushaggarwal.tripmonkey.home.activity.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.example.networkrequestlib.ApiRequestClass;
import com.example.networkrequestlib.interfaces.VolleyResponseListener;
import com.example.networkrequestlib.models.AutoCompleteCity;
import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.configuration.UriBuilder;
import com.example.piyushaggarwal.tripmonkey.core.AbstractBaseFragment;
import com.example.piyushaggarwal.tripmonkey.helper.TripFragmentHelper;
import com.google.gson.Gson;

public class TripFragment extends AbstractBaseFragment implements VolleyResponseListener {

    View mView;
    TripFragmentHelper tripFragmentHelper;
    AutoCompleteTextView sourceAutoComplete, destinationAutoComplete;
    TextWatcher textWatcher;
    AutoCompleteCity[] customers;
    ArrayAdapter autoCompleteAdapter;
    String[] cityList;
    View.OnClickListener setRouteClickListener;
    Button setRouteBtn;

    public TripFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tripFragmentHelper = new TripFragmentHelper(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_trip_fragment_one, container, false);

        initListeners();
        initUi();
        return mView;
    }

    public void initUi() {
        sourceAutoComplete = (AutoCompleteTextView) mView.findViewById(R.id.autocomplete_source);
        destinationAutoComplete = (AutoCompleteTextView) mView.findViewById(R.id.autocomplete_destination);
        setRouteBtn = (Button) mView.findViewById(R.id.getRoute);
        setRouteBtn.setOnClickListener(setRouteClickListener);
        sourceAutoComplete.addTextChangedListener(textWatcher);
        destinationAutoComplete.addTextChangedListener(textWatcher);
    }

    public void initListeners() {

        setRouteClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };

        textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 1)
                    requestdata(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
    }

    public void requestdata(String inputtext) {
        ApiRequestClass.getInstance().apiRequest(this, getActivity(), UriBuilder.getInstance().getAutoCompleteCity(inputtext), AutoCompleteCity.class, 1);
    }

    @Override
    public <T> void onVolleySuccessResult(String response, T modelResponse, int requestCode) {
        switch (requestCode) {
            case 1:
                if (!response.equals("{}")) {
                    customers = new Gson().fromJson(response, AutoCompleteCity[].class);
                    cityList = new String[customers.length];
                    for (int i = 0; i < customers.length; i++)
                        cityList[i] = (customers[i].getText());
                    autoCompleteAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, cityList);
                    sourceAutoComplete.setAdapter(autoCompleteAdapter);
                    destinationAutoComplete.setAdapter(autoCompleteAdapter);
                    autoCompleteAdapter.notifyDataSetChanged();
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void onVolleyErrorResult(String errorMessage) {
        Toast.makeText(getActivity(), errorMessage, Toast.LENGTH_SHORT).show();
    }

}
