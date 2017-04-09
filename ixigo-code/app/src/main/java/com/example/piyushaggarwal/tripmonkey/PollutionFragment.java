package com.example.piyushaggarwal.tripmonkey;


import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.piyushaggarwal.tripmonkey.home.activity.activity.HomeActivity;
import com.example.piyushaggarwal.tripmonkey.home.fragments.DetailFragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class PollutionFragment extends Fragment implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {


    View mView;
    private GoogleMap mMap;

    protected GoogleApiClient mGoogleApiClient;
    protected Location mLastLocation;
    protected String mLatitudeLabel;
    protected String mLongitudeLabel;
    Double mLat, mLong;
    Button submitScore;

    public PollutionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_pollution, container, false);
        PulsatorLayout pulsator = (PulsatorLayout) mView.findViewById(R.id.pulsator);
        pulsator.start();
        SupportMapFragment mapFragment = null;
        mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        submitScore = (Button) mView.findViewById(R.id.getScore);
        mapFragment.getMapAsync(this);
        submitScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((HomeActivity) getActivity()).addFragmentToContainer(new DetailFragment());
            }
        });
        return mView;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        buildGoogleApiClient();
    }

    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(getActivity())
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();
        mGoogleApiClient.connect();

    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        LatLng currentLocation = new LatLng(28.4458870, 77.0986190);

        mMap.addMarker(new MarkerOptions()
                .position(currentLocation)
                .title("Source Location")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.cycle)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(currentLocation));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 12));

        LatLng sourceDestination = new LatLng(28.4168930, 77.0986110);

        mMap.addMarker(new MarkerOptions()
                .position(sourceDestination)
                .title("Destination Location")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.cycle)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sourceDestination));
        showCircle();
    }

    public void showCircle() {
        Circle circle1 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4454870, 77.0986390))
                .radius(300)
                .strokeColor(Color.RED)
                .fillColor(Color.RED));

        Circle circle2 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4454870, 77.0186390))
                .radius(200)
                .strokeColor(Color.GREEN)
                .fillColor(Color.GREEN));

        Circle circle3 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4454870, 77.0286390))
                .radius(300)
                .strokeColor(Color.GRAY)
                .fillColor(Color.GRAY));

        Circle circle4 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4454870, 77.0386390))
                .radius(600)
                .strokeColor(Color.RED)
                .fillColor(Color.RED));

        Circle circle5 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4454870, 77.0486390))
                .radius(400)
                .strokeColor(Color.GREEN)
                .fillColor(Color.GREEN));

        Circle circle6 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4454870, 77.0586390))
                .radius(400)
                .strokeColor(Color.GRAY)
                .fillColor(Color.GRAY));

        Circle circle7 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4258870, 77.0986790))
                .radius(400)
                .strokeColor(Color.GRAY)
                .fillColor(Color.GRAY));
        Circle circle8 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4158870, 77.0986290))
                .radius(300)
                .strokeColor(Color.GRAY)
                .fillColor(Color.GRAY));
        Circle circle9 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4158870, 77.0986150))
                .radius(300)
                .strokeColor(Color.GRAY)
                .fillColor(Color.GRAY));

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    public void onResume() {
        super.onResume();
        ((HomeActivity) getActivity()).fab.setVisibility(View.GONE);

    }

    @Override
    public void onPause() {
        super.onPause();
        ((HomeActivity) getActivity()).fab.setVisibility(View.VISIBLE);

    }

}
