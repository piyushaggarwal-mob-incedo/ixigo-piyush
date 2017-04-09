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
import com.example.networkrequestlib.models.Routes;
import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.adapter.TripListAdapter;
import com.example.piyushaggarwal.tripmonkey.adapter.TripListAdapterCity;
import com.example.piyushaggarwal.tripmonkey.configuration.UriBuilder;
import com.example.piyushaggarwal.tripmonkey.core.AbstractBaseFragment;
import com.example.piyushaggarwal.tripmonkey.helper.TripFragmentHelper;
import com.google.gson.Gson;

import java.util.Arrays;

public class TripFragment extends AbstractBaseFragment implements VolleyResponseListener {

    View mView;
    TripFragmentHelper tripFragmentHelper;
    AutoCompleteTextView sourceAutoComplete, destinationAutoComplete;
    TextWatcher textWatcherOne, textWatcherTwo;
    AutoCompleteCity[] sourceDestinationList, sourceList, destList;
    A2BResponseModel a2BResponseModelData;
    Routes[] routesList;
    ArrayAdapter autoCompleteAdapter;
    String[] cityList, destCityList;
    View.OnClickListener setRouteClickListener;
    Button setRouteBtn;
    RecyclerView cityRecyclerView;
    TripListAdapter tripListAdapter;
    TripListAdapterCity tripListAdapterCity;
    String sourceId, DestinationId;
    int editTextType;
    int sourceXID, destinationXID;

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
        sourceAutoComplete.addTextChangedListener(textWatcherOne);
        destinationAutoComplete.addTextChangedListener(textWatcherTwo);
        //requestdata(0);
    }

    public void populateDefaultDataOnScreen() {
        tripListAdapterCity = new TripListAdapterCity(cityList, getActivity());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        cityRecyclerView.setLayoutManager(mLayoutManager);
        cityRecyclerView.setItemAnimator(new DefaultItemAnimator());
        cityRecyclerView.setAdapter(tripListAdapterCity);
        tripListAdapterCity.notifyDataSetChanged();
    }

    public void populateDataOnScreen() {
        tripListAdapter = new TripListAdapter(a2BResponseModelData, getActivity());
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
                String editTextValueOne = sourceAutoComplete.getText().toString();
                String editTextValueTwo = destinationAutoComplete.getText().toString();
                if (editTextValueOne != null || editTextValueTwo != null) {
                    int sourceId = Arrays.asList(cityList).indexOf(editTextValueOne);
                    int destinationId = Arrays.asList(destCityList).indexOf(editTextValueTwo);
                    sourceXID = sourceList[sourceId].getXid();
                    destinationXID = destList[destinationId].getXid();

                }

                requestdata(5);
            }
        };

        textWatcherTwo = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 1)
                    //requestEditTextData(s.toString());
                    ApiRequestClass.getInstance().apiRequest(TripFragment.this, getActivity(), UriBuilder.getInstance().getAutoCompleteCity(s.toString()), AutoCompleteCity.class, 8);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        textWatcherOne = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 1)
                    // requestEditTextData(s.toString());
                    ApiRequestClass.getInstance().apiRequest(TripFragment.this, getActivity(), UriBuilder.getInstance().getAutoCompleteCity(s.toString()), AutoCompleteCity.class, 7);

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        };
    }

    public void requestEditTextData(String inputText) {
        ApiRequestClass.getInstance().apiRequest(this, getActivity(), UriBuilder.getInstance().getAutoCompleteCity(inputText), AutoCompleteCity.class, 1);
    }


    public void requestdata(int requestCode) {

        switch (requestCode) {
            case 0:
                requestEditTextData("de");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                ApiRequestClass.getInstance().apiRequest(this, getActivity(), UriBuilder.getInstance().getA2BAPIData("", Integer.toString(sourceXID), Integer.toString(destinationXID)), A2BResponseModel.class, 6);
                break;
            default:
                break;
        }

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
                    //populateDataOnScreen();
                    populateDefaultDataOnScreen();
                }
                break;
            case 2:
                if (!response.equals("{}")) {
                    APIARREsponseModel apiarrEsponseModel = new Gson().fromJson(response, APIARREsponseModel.class);
                    if (sourceDestinationList != null) {
                        System.out.println("==== API AR Response Model ===" + apiarrEsponseModel.getData().getCity());
                        populateDataOnScreen();
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
                    a2BResponseModelData = new Gson().fromJson(response, A2BResponseModel.class);
                    routesList = a2BResponseModelData.getData().getRoutes();
                    if (a2BResponseModelData != null) {
                        System.out.println("==== A2B Data ===" + a2BResponseModelData.getData().getDestination().getName());
                        populateDataOnScreen();
                    }

                }
                break;
            case 7:
                if (!response.equals("{}")) {
                    sourceList = new Gson().fromJson(response, AutoCompleteCity[].class);
                    cityList = new String[sourceList.length];
                    for (int i = 0; i < sourceList.length; i++)
                        cityList[i] = (sourceList[i].getText());
                    autoCompleteAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, cityList);
                    sourceAutoComplete.setAdapter(autoCompleteAdapter);
                    destinationAutoComplete.setAdapter(autoCompleteAdapter);
                    autoCompleteAdapter.notifyDataSetChanged();
                    //populateDataOnScreen();
                    populateDefaultDataOnScreen();
                }
                break;
            case 8:
                if (!response.equals("{}")) {
                    destList = new Gson().fromJson(response, AutoCompleteCity[].class);
                    destCityList = new String[destList.length];
                    for (int i = 0; i < destList.length; i++)
                        destCityList[i] = (destList[i].getText());
                    autoCompleteAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, destCityList);
                    sourceAutoComplete.setAdapter(autoCompleteAdapter);
                    destinationAutoComplete.setAdapter(autoCompleteAdapter);
                    autoCompleteAdapter.notifyDataSetChanged();
                    //populateDataOnScreen();
                    populateDefaultDataOnScreen();
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
