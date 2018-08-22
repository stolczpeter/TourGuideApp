package com.example.peterstolcz.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitiesFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.topic_list, container, false);

        final ArrayList<Location> location_items = new ArrayList<Location>();

        location_items.add(new Location(getString(R.string.Rivers_1), getString(R.string.Rivers_2), getString(R.string.Rivers_3), R.drawable.raba));
        location_items.add(new Location(getString(R.string.Zoo_1), getString(R.string.Zoo_2), getString(R.string.Zoo_3), R.drawable.allatkertgyor));
        location_items.add(new Location(getString(R.string.Forest_1), getString(R.string.Forest_2), getString(R.string.Forest_3), R.drawable.puspokerdo));
        location_items.add(new Location(getString(R.string.Spa_1), getString(R.string.Spa_2), getString(R.string.Spa_3), R.drawable.thermalbath));
        location_items.add(new Location(getString(R.string.Nyul_1), getString(R.string.Nyul_2), getString(R.string.Nyul_3), R.drawable.nyul));

        LocationAdapter adapter = new LocationAdapter(getActivity(), location_items, R.color.topic_Activities);

        ListView listView = (ListView) rootView.findViewById(R.id.topic_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}