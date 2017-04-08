package com.example.piyushaggarwal.tripmonkey.home.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import com.example.networkrequestlib.models.A2BResponseModel;
import com.example.networkrequestlib.models.APIARREsponseModel;
import com.example.networkrequestlib.models.AutoCompleteCity;
import com.example.networkrequestlib.models.CityInterestesponseModel;
import com.example.networkrequestlib.models.EntityDetailResponseModel;
import com.example.networkrequestlib.models.RecommendationAPIResponseModel;
import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.adapter.TripListAdapter;
import com.example.piyushaggarwal.tripmonkey.configuration.UriBuilder;
import com.example.piyushaggarwal.tripmonkey.core.AbstractBaseFragment;
import com.example.piyushaggarwal.tripmonkey.helper.TripFragmentHelper;
import com.google.gson.Gson;

public class TripFragment extends AbstractBaseFragment implements VolleyResponseListener {

    View mView;
    TripFragmentHelper tripFragmentHelper;
    AutoCompleteTextView sourceAutoComplete, destinationAutoComplete;
    TextWatcher textWatcher;
    AutoCompleteCity[] sourceDestinationList;
    ArrayAdapter autoCompleteAdapter;
    String[] cityList;
    View.OnClickListener setRouteClickListener;
    Button setRouteBtn;
    RecyclerView cityRecyclerView;
    TripListAdapter tripListAdapter;

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
        cityRecyclerView = (RecyclerView) mView.findViewById(R.id.cityRecyclerView);
        setRouteBtn.setOnClickListener(setRouteClickListener);
        sourceAutoComplete.addTextChangedListener(textWatcher);
        destinationAutoComplete.addTextChangedListener(textWatcher);
        requestdata("de");
    }

    public void populateDataOnScreen() {
        tripListAdapter = new TripListAdapter(sourceDestinationList, getActivity());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        cityRecyclerView.setLayoutManager(mLayoutManager);
        cityRecyclerView.setItemAnimator(new DefaultItemAnimator());
        cityRecyclerView.setAdapter(tripListAdapter);
        tripListAdapter.notifyDataSetChanged();
    }

    public void initListeners() {

        setRouteClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                populateDataOnScreen();
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
        // ApiRequestClass.getInstance().apiRequest(this, getActivity(), UriBuilder.getInstance().getAutoCompleteCity(inputtext), AutoCompleteCity.class, 1);

        // System.out.println("URI " + UriBuilder.getInstance().getARData());
        //  ApiRequestClass.getInstance().apiRequest(this, getActivity(), UriBuilder.getInstance().getARData(), APIARREsponseModel.class, 2);

        //  System.out.println("URI " + UriBuilder.getInstance().getCityInterestsAPIData("", "", "", ""));
        //  ApiRequestClass.getInstance().apiRequest(this, getActivity(), UriBuilder.getInstance().getCityInterestsAPIData("", "", "", ""), CityInterestData.class, 3);

        //  ApiRequestClass.getInstance().apiRequest(this, getActivity(),"http://build2.ixigo.com/api/v3/namedentities/city/503b2a99e4b032e338f15201/categories?apiKey=ixicode!2$&type=hotel&skip=1&limit=5" , CityInterestData.class, 3);

        //   System.out.println("URI " + UriBuilder.getInstance().getCityInterestsAPIData("", "", "", ""));

        // http://build2.ixigo.com/api/v3/namedentities/city/503b2a99e4b032e338f15201/categories?apiKey=ixicode!2$&type=hotel&skip=1&limit=5

        //   System.out.println("URI " + UriBuilder.getInstance().getEntityDetailAPIData(""));
        // ApiRequestClass.getInstance().apiRequest(this, getActivity(), UriBuilder.getInstance().getEntityDetailAPIData("503b2a99e4b032e338f15201"), EntityDetailResponseModel.class, 4);

      /*  System.out.println("URI " + UriBuilder.getInstance().getRecommendedAPIData("", ""));
        ApiRequestClass.getInstance().apiRequest(this, getActivity(), UriBuilder.getInstance().getRecommendedAPIData("", ""), RecommendationAPIResponseModel.class, 5);
*/
        System.out.println("URI " + UriBuilder.getInstance().getA2BAPIData("", "", ""));
        ApiRequestClass.getInstance().apiRequest(this, getActivity(), UriBuilder.getInstance().getA2BAPIData("", "", ""), A2BResponseModel.class, 6);

    }

    @Override
    public <T> void onVolleySuccessResult(String response, T modelResponse, int requestCode) {
        switch (requestCode) {
            case 1:
                if (!response.equals("{}")) {
                    sourceDestinationList = new Gson().fromJson(response, AutoCompleteCity[].class);
                    cityList = new String[sourceDestinationList.length];
                    for (int i = 0; i < sourceDestinationList.length; i++)
                        cityList[i] = (sourceDestinationList[i].getText());
                    autoCompleteAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, cityList);
                    sourceAutoComplete.setAdapter(autoCompleteAdapter);
                    destinationAutoComplete.setAdapter(autoCompleteAdapter);
                    autoCompleteAdapter.notifyDataSetChanged();
                    populateDataOnScreen();
                }
                break;
            case 2:
                if (!response.equals("{}")) {
                    APIARREsponseModel apiarrEsponseModel = new Gson().fromJson(response, APIARREsponseModel.class);
                    if (sourceDestinationList != null) {
                        System.out.println("==== API AR Response Model ===" + apiarrEsponseModel.getData().getCity());
                    }
                }
                break;
            case 3:
                if (!response.equals("{}")) {
                    CityInterestesponseModel sourceDestinationList = new Gson().fromJson(response, CityInterestesponseModel.class);
                    if (sourceDestinationList != null) {
                        System.out.println("==== City Name ===" + sourceDestinationList.getData().getHotel()[1].getCityName());
                    }
                }
                break;
            case 4:
                if (!response.equals("{}")) {
                    EntityDetailResponseModel entityDetailResponseModel = new Gson().fromJson(response, EntityDetailResponseModel.class);
                    if (entityDetailResponseModel != null) {
                        System.out.println("==== Entity Detail Data ===" + entityDetailResponseModel.getData().getName());
                    }
                }
                break;
            case 5:
                if (!response.equals("{}")) {
                    RecommendationAPIResponseModel recommendationAPIResponseModel = new Gson().fromJson(response, RecommendationAPIResponseModel.class);
                    if (recommendationAPIResponseModel != null) {
                        System.out.println("==== Recomm Data ===" + recommendationAPIResponseModel.getData().getFlight().get(0).getCountryName());
                    }
                }
                break;
            case 6:
                if (!response.equals("{}")) {
                    A2BResponseModel a2BResponseModel = new Gson().fromJson(response, A2BResponseModel.class);
                    if (a2BResponseModel != null) {
                        System.out.println("==== A2B Data ===" + a2BResponseModel.getData().getDestination().getName());
                    }
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
