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
public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Touring> words = new ArrayList<Touring>();
        words.add(new Touring(getString(R.string.name_fairmont_E), getString(R.string.event_festivalTrees) +
                getString(R.string.date_nov19)));
        words.add(new Touring(getString(R.string.name_sheraton_E), getString(R.string.event_gingerbreadVillage) +
                getString(R.string.date_nov22)));
        words.add(new Touring(getString(R.string.name_pike_market_E), getString(R.string.event_magicInMarket) +
                getString(R.string.date_nov26)));
        words.add(new Touring(getString(R.string.name_paramount_E), getString(R.string.event_King_and_I) +
                getString(R.string.date_dec8)));
        words.add(new Touring(getString(R.string.name_centurylink_E),
                getString(R.string.event_seahawkGame) + getString(R.string.date_dec4)));
        words.add(new Touring(getString(R.string.name_paramount2_E),
                getString(R.string.event_rent) + getString(R.string.dae_feb26)));
        words.add(new Touring(getString(R.string.name_tacoma_E), getString(R.string.event_floridaGeorgiaLine) +
                getString(R.string.date_nov11)));
        words.add(new Touring(getString(R.string.name_mccaw_hall_E), getString(R.string.event_nutCracker) +
                getString(R.string.date_nov8)));
        words.add(new Touring(getString(R.string.name_downtown_E), getString(R.string.event_thanksgivingParade)
                + getString(R.string.date_nov24)));
        words.add(new Touring(getString(R.string.name_seattle_E), getString(R.string.event_jingleDash) +
                getString(R.string.date_dec3)));
        words.add(new Touring(getString(R.string.name_tacoma_zoo_E), getString(R.string.event_lightsFestival) +
                getString(R.string.date_dec16)));
        words.add(new Touring(getString(R.string.name_space_needle_E), getString(R.string.event_newYears) +
                getString(R.string.date_dec31)));

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

