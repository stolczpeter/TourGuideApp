package com.example.peterstolcz.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class Sights extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.topic_list, container, false);

        final ArrayList<Location> location_items = new ArrayList<Location>();

        location_items.add(new Location(getString(R.string.Townhall_1), getString(R.string.Townhall_2), getString(R.string.Townhall_3), R.drawable.town_hall));
        location_items.add(new Location(getString(R.string.Széchenyisquare_1), getString(R.string.Széchenyisquare_2), getString(R.string.Széchenyisquare_3), R.drawable.szechenyi_square));
        location_items.add(new Location(getString(R.string.Barossstreet_1), getString(R.string.Barossstreet_2), getString(R.string.Barossstreet_3), R.drawable.baross_street));
        location_items.add(new Location(getString(R.string.Benedictinechruch_1), getString(R.string.Barossstreet_2), getString(R.string.Benedictinechurch_3), R.drawable.benedictine_church));
        location_items.add(new Location(getString(R.string.Basilica_1), getString(R.string.Basilica_2), getString(R.string.Basilica_3), R.drawable.basilica));

        LocationAdapter adapter = new LocationAdapter(getActivity(), location_items, R.color.topic_Sights);

        ListView listView = (ListView) rootView.findViewById(R.id.topic_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}