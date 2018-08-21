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

        location_items.add(new Location("La Maréda", "High-end traditional kitchen", "Apáca utca 4", R.drawable.lamareda));
        location_items.add(new Location("Pálffy Restaurant", "Hungarian & international kitchen", "Jedlik Ányos utca 19", R.drawable.palffy));
        location_items.add(new Location("Zöldfa Restaurant", "Popular local restaurant", "Hunyadi utca 2", R.drawable.zoldfa));
        location_items.add(new Location("Kristaly Restaurant", "Popular local restaurant", "Bartók Béla út 9", R.drawable.kristaly));
        location_items.add(new Location("Nimrod Restaurant", "Traditional kitchen", "Nagy Imre utca 48", R.drawable.nimrod));

        LocationAdapter adapter = new LocationAdapter(getActivity(), location_items, R.color.topic_Cuisine);

        ListView listView = (ListView) rootView.findViewById(R.id.topic_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}