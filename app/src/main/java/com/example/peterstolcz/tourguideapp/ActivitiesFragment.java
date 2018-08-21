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

        location_items.add(new Location("River intersection", "Intersection of Mosoni Duna and Raba", "Best view from Jedlik Ányos bridge", R.drawable.raba));
        location_items.add(new Location("Visiting Győr Zoo", "A diverse and children friendly zoo", "Állatkerti krt. 12", R.drawable.allatkertgyor));
        location_items.add(new Location("Hiking in Püspök Erdő", "Forest with rich wildlife", "20 minutes walk from the city center", R.drawable.puspokerdo));
        location_items.add(new Location("Aquapark", "A thermal spa in the center of Győr", "Fürdő tér 1", R.drawable.thermalbath));
        location_items.add(new Location("Hiking in Nyúl area", "Hiking path - easily reachable from Győr", "20 minutes drive from Győr", R.drawable.nyul));

        LocationAdapter adapter = new LocationAdapter(getActivity(), location_items, R.color.topic_Activities);

        ListView listView = (ListView) rootView.findViewById(R.id.topic_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}