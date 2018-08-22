package com.example.peterstolcz.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CuisineFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.topic_list, container, false);

        final ArrayList<Location> location_items = new ArrayList<Location>();

        location_items.add(new Location(getString(R.string.Lamareda_1), getString(R.string.Lamareda_2), getString(R.string.Lemareda_3), R.drawable.lamareda));
        location_items.add(new Location(getString(R.string.Palffy_1), getString(R.string.Palffy_2), getString(R.string.Palffy_3), R.drawable.palffy));
        location_items.add(new Location(getString(R.string.Zoldfa_1), getString(R.string.Zoldfa_2), getString(R.string.Zoldfa_3), R.drawable.zoldfa));
        location_items.add(new Location(getString(R.string.Kristaly_1), getString(R.string.Kisbohem_2), getString(R.string.Kisbohem_3), R.drawable.kristaly));
        location_items.add(new Location(getString(R.string.Nimrod_1), getString(R.string.Nimrod_2), getString(R.string.Nimrod_3), R.drawable.nimrod));

        LocationAdapter adapter = new LocationAdapter(getActivity(), location_items, R.color.topic_Cuisine);

        ListView listView = (ListView) rootView.findViewById(R.id.topic_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}