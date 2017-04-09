package com.example.piyushaggarwal.tripmonkey.home.fragments;


import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.piyushaggarwal.tripmonkey.R;
import com.example.piyushaggarwal.tripmonkey.home.activity.activity.HomeActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment implements OnMapReadyCallback {

    View mView;
    private GoogleMap mMap;

    protected GoogleApiClient mGoogleApiClient;
    protected Location mLastLocation;
    protected String mLatitudeLabel;
    protected String mLongitudeLabel;
    Double mLat, mLong;
    Button submitScore;

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_detail, container, false);
        SupportMapFragment mapFragment = null;
        mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        return mView;
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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

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

        Polyline line = mMap.addPolyline(new PolylineOptions()
                .add(currentLocation, sourceDestination)
                .width(5)
                .color(Color.RED));

        showCircle();
    }

    public void showCircle() {
        Circle circle1 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4154870, 77.0986290))
                .radius(300)
                .strokeColor(Color.RED)
                .fillColor(Color.RED));

        Circle circle2 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4254870, 77.0186590))
                .radius(200)
                .strokeColor(Color.GREEN)
                .fillColor(Color.GREEN));

        Circle circle3 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4354870, 77.0286190))
                .radius(300)
                .strokeColor(Color.GRAY)
                .fillColor(Color.GRAY));

        Circle circle4 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4454870, 77.0386090))
                .radius(600)
                .strokeColor(Color.RED)
                .fillColor(Color.RED));

        Circle circle5 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4754870, 77.0486690))
                .radius(400)
                .strokeColor(Color.GREEN)
                .fillColor(Color.GREEN));

        Circle circle6 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.42454870, 77.0586930))
                .radius(400)
                .strokeColor(Color.GRAY)
                .fillColor(Color.GRAY));

        Circle circle7 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4958870, 77.0985690))
                .radius(400)
                .strokeColor(Color.GRAY)
                .fillColor(Color.GRAY));
        Circle circle8 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4858870, 77.0986450))
                .radius(300)
                .strokeColor(Color.GRAY)
                .fillColor(Color.GRAY));
        Circle circle9 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(28.4158870, 77.0986250))
                .radius(300)
                .strokeColor(Color.GRAY)
                .fillColor(Color.GRAY));

    }
}
