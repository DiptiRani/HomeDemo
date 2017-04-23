package com.dipti.spotsoon.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dipti.spotsoon.app.R;
import com.dipti.spotsoon.app.adapters.VideoAdapter;
import com.dipti.spotsoon.app.utils.Data;

public class FragmentVideos extends Fragment {

    private RecyclerView recyclerViewVideos;
    private VideoAdapter videoAdapter;


    public FragmentVideos() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_videos, container, false);
        recyclerViewVideos = (RecyclerView) view.findViewById(R.id.recyclerViewVideos);
        recyclerViewVideos.setLayoutManager(new LinearLayoutManager(getActivity()));
        videoAdapter = new VideoAdapter(Data.getVideos());
        recyclerViewVideos.setAdapter(videoAdapter);
        return view;
    }
}
