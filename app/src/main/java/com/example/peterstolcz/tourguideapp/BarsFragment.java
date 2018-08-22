package com.example.peterstolcz.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class BarsFragment extends android.support.v4.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.topic_list, container, false);

        final ArrayList<Location> location_items = new ArrayList<Location>();

        location_items.add(new Location(getString(R.string.Csillag_1), getString(R.string.Csillag_2), getString(R.string.Csillag_3), R.drawable.csillag));
        location_items.add(new Location(getString(R.string.Hrabal_1), getString(R.string.Hrabal_2), getString(R.string.Hrabal_3), R.drawable.hrabal));
        location_items.add(new Location(getString(R.string.Kisbohem_1), getString(R.string.Kisbohem_2), getString(R.string.Kisbohem_3), R.drawable.kisbohem));
        location_items.add(new Location(getString(R.string.Johnbull_1), getString(R.string.Johnbull_2), getString(R.string.Johnbull_3), R.drawable.johnbull));
        location_items.add(new Location(getString(R.string.Divino_1), getString(R.string.Divino_2), getString(R.string.Divino_3), R.drawable.divino));

        LocationAdapter adapter = new LocationAdapter(getActivity(), location_items, R.color.topic_Bars);

        ListView listView = (ListView) rootView.findViewById(R.id.topic_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}