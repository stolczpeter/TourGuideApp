package com.example.peterstolcz.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TopicAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TopicAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    public TopicAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Sights();
        } else if (position == 1) {
            return new CuisineFragment();
        } else if (position == 2){
            return new ActivitiesFragment();
        } else {
        return new Bars();
    }
}

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.topic_Sights);
        } else if (position == 1) {
            return mContext.getString(R.string.topic_Cuisine);
        } else if (position == 2) {
            return mContext.getString(R.string.topic_Activities);
        } else {
            return mContext.getString(R.string.topic_Bars);
        }
    }
}