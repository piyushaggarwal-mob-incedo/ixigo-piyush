package com.example.piyushaggarwal.tripmonkey.core;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.piyushaggarwal.tripmonkey.R;


public class AbstractBaseActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    public void addFragmentToContainer(Fragment currentFragment) {
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        //fragmentTransaction.setCustomAnimations(R.animator.slide_in_up, R.animator.);

        fragmentTransaction.add(R.id.fragment_container, currentFragment, "TripFragment");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
