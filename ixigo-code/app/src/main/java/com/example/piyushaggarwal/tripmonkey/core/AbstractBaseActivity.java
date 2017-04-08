package com.example.piyushaggarwal.tripmonkey.core;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.piyushaggarwal.tripmonkey.R;


public class AbstractBaseActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    public void addFragmentToContainer(Fragment currentFragment) {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        //fragmentTransaction.setCustomAnimations(R.animator.slide_in_up, R.animator.);

        fragmentTransaction.replace(R.id.fragment_container, currentFragment, "TripFragment");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
