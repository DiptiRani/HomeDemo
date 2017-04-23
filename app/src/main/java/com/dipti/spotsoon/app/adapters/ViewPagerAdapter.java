package com.dipti.spotsoon.app.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final FragmentManager fm;
    private final ArrayList<String> titles;
    private final ArrayList<Fragment> fragments;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<String> titles, ArrayList<Fragment> fragments) {
        super(fm);
        this.fm = fm;
        this.titles = titles;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
