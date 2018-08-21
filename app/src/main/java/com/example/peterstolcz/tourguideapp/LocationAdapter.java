package com.example.peterstolcz.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private int mColorResourceId;

    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();

    public LocationAdapter(Activity context, ArrayList<Location> wordArrayList, int colorResourceId) {
        super(context, 0, wordArrayList);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.items, parent, false);
        }

        Location customtext = getItem(position);

        TextView explanationTextView = (TextView) listItemView.findViewById(R.id.explanation_text);
        explanationTextView.setText(customtext.getExplanation());

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text);
        titleTextView.setText(customtext.getTitle());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text);
        locationTextView.setText(customtext.getLocation());

        ImageView listImageView = (ImageView) listItemView.findViewById(R.id.list_image);

        if (customtext.hasImage()) {

            listImageView.setImageResource(customtext.getImageResouceId());
            listImageView.setVisibility(View.VISIBLE);
        } else {
            listImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
