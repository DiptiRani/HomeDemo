package com.dipti.spotsoon.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dipti.spotsoon.app.R;

public class FragmentImages extends Fragment {


    public FragmentImages() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_images, container, false);
        return view;
    }
}
