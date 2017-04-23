package com.dipti.spotsoon.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dipti.spotsoon.app.R;

public class FragmentMileStone extends Fragment {


    public FragmentMileStone() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_mile_stone, container, false);
        return view;
    }
}
