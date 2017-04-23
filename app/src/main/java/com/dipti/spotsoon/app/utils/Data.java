package com.dipti.spotsoon.app.utils;

import com.dipti.spotsoon.app.R;
import com.dipti.spotsoon.app.models.Video;

import java.util.ArrayList;


public class Data {

    public static ArrayList<Video> getVideos(){
        ArrayList<Video> list = new ArrayList<Video>();

        Video video1 = new Video(1,"Title1","18 Min Ago","This is the Descriptionnnnnnn", R.mipmap.ic_launcher);
        list.add(video1);
        Video video2 = new Video(1,"Title1","18 Min Ago","This is the Descriptionnnnnnn", R.mipmap.ic_launcher);
        list.add(video2);
        Video video3 = new Video(1,"Title1","18 Min Ago","This is the Descriptionnnnnnn", R.mipmap.ic_launcher);
        list.add(video3);
        Video video4 = new Video(1,"Title1","18 Min Ago","This is the Descriptionnnnnnn", R.mipmap.ic_launcher);
        list.add(video4);

        return list;
    }
}
