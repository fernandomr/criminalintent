package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CrimeFragment extends Fragment {

    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    // onCreateView is where the layout for the fragment's view is inflated and returned to the hosting activity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_crime, container, false);   // fragment_crime is the xml file name

        // the onCreateView method of a fragment is also the place to connect the UI components
        // to respond to user input

        return v;
    }
}
