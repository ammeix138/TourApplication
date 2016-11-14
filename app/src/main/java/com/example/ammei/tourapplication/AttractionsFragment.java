package com.example.ammei.tourapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Touring> words = new ArrayList<Touring>();
        words.add(new Touring(getString(R.string.name_pike_place),
                getString(R.string.Description_pike_place), R.drawable.pike_place));
        words.add(new Touring(getString(R.string.name_space_needle),
                getString(R.string.description_space_needle), R.drawable.seattle));
        words.add(new Touring(getString(R.string.name_pioneer_square),
                getString(R.string.description_pioneer_square), R.drawable.pioneer_sqr));
        words.add(new Touring(getString(R.string.name_seattle_aquarium),
                getString(R.string.description_seattle_aquarium), R.drawable.aquarium));
        words.add(new Touring(getString(R.string.name_science_center),
                getString(R.string.description_science_center), R.drawable.science_center));
        words.add(new Touring(getString(R.string.name_flight_museum),
                getString(R.string.description_flight_museum), R.drawable.flight));
        words.add(new Touring(getString(R.string.name_woodland_park),
                getString(R.string.description_woodland_park), R.drawable.zoo));
        words.add(new Touring(getString(R.string.name_emp_museum),
                getString(R.string.decription_emp_museum), R.drawable.emp));
        words.add(new Touring(getString(R.string.name_great_wheel),
                getString(R.string.description_great_wheel), R.drawable.wheel));
        words.add(new Touring(getString(R.string.name_tillicum),
                getString(R.string.description_tillicum), R.drawable.tillicum));
        words.add(new Touring(getString(R.string.name_henry_art),
                getString(R.string.description_henry_art), R.drawable.henry_art));
        words.add(new Touring(getString(R.string.name_centurylink_field),
                getString(R.string.description_centurylink_field), R.drawable.centurylink_field));
        words.add(new Touring(getString(R.string.name_safeco_field),
                getString(R.string.description_safeco_field), R.drawable.safeco_field));

        // This is the array adapter for the ListView layout which will hold the data and recycle
        // views as needed.
        TouringAdapter adapter =
                new TouringAdapter(getActivity(), words);

        // Created a view to store and display the ArrayList in the AttractionsActivity.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Adds the additional child view to the parent(root) view.
        listView.setAdapter(adapter);

        return rootView;
    }
}