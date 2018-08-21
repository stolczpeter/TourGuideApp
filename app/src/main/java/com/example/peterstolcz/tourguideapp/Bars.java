package com.example.peterstolcz.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class Bars extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.topic_list, container, false);

        final ArrayList<Location> location_items = new ArrayList<Location>();

        location_items.add(new Location("Csillag", "Retro bar & café", "Csillag utca 6", R.drawable.csillag));
        location_items.add(new Location("Hrabal", "Czech stlye pub", "Czuczor Gergely utca 6", R.drawable.hrabal));
        location_items.add(new Location("Kis Bohém", "Popular bar & café", "Jedlik Ányos utca 17", R.drawable.kisbohem));
        location_items.add(new Location("John Bull Pub", "Bar & restaurant in the city center", "Aradi vértanúk útja 3", R.drawable.johnbull));
        location_items.add(new Location("Divino", "Wine bar on the main square", "Széchenyi tér 7", R.drawable.divino));

        LocationAdapter adapter = new LocationAdapter(getActivity(), location_items, R.color.topic_Bars);

        ListView listView = (ListView) rootView.findViewById(R.id.topic_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}