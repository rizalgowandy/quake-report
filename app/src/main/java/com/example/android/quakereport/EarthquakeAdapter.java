package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rizalgow on 10/10/16.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter (Activity context, ArrayList<Earthquake> earthquake){
        super(context, 0, earthquake);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView scaleTextView = (TextView) listItemView.findViewById(R.id.scale);
        scaleTextView.setText(currentEarthquake.getScale());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        locationTextView.setText(currentEarthquake.getLocation());

        TextView datetimeTextView = (TextView) listItemView.findViewById(R.id.datetime);
        datetimeTextView.setText(currentEarthquake.getDatetime());

        return listItemView;
    }

}
