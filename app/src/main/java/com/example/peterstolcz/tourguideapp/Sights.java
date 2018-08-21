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

        location_items.add(new Location("Town hall", "Neo-Baroque style town hall", "Városház tér 1", R.drawable.town_hall));
        location_items.add(new Location("Szécshenyi square", "Square surrounded by baroque houses", "Szécshenyi tér", R.drawable.szechenyi_square));
        location_items.add(new Location("Baross street", "Major walking and shopping street in Győr", "Baross utca", R.drawable.baross_street));
        location_items.add(new Location("Benedictine church", "Church and in the 17th c.", "Széchenyi tér 8", R.drawable.benedictine_church));
        location_items.add(new Location("Győr Basilica", "Cathedral built in the 11th c.", "Káptalandomb", R.drawable.basilica));

        LocationAdapter adapter = new LocationAdapter(getActivity(), location_items, R.color.topic_Sights);

        ListView listView = (ListView) rootView.findViewById(R.id.topic_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}