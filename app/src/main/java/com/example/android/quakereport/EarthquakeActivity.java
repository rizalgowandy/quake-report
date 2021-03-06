/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("1.1", "San Francisco", "Feb 2, 2016"));
        earthquakes.add(new Earthquake("2.1", "London", "Feb 7, 2016"));
        earthquakes.add(new Earthquake("3.1", "China", "Feb 5, 2016"));
        earthquakes.add(new Earthquake("4.1", "Japan", "Feb 3, 2016"));
        earthquakes.add(new Earthquake("5.1", "Indonesia", "Feb 4, 2016"));
        earthquakes.add(new Earthquake("6.1", "Korea", "Feb 10, 2016"));

        EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this, earthquakes);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(earthquakeAdapter);
    }
}
