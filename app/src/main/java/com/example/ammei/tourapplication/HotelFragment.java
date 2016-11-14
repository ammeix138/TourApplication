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
public class HotelFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Touring> words = new ArrayList<Touring>();
        words.add(new Touring(getString(R.string.name_fairmont_H), getString(R.string.hotel_fairmont_phone) +
                getString(R.string.hotel_fairmont_address), R.drawable.fairmont));
        words.add(new Touring(getString(R.string.name_sorrento_H), getString(R.string.hotel_sorrento_phone) +
                getString(R.string.hotel_sorrento_address), R.drawable.sorrento));
        words.add(new Touring(getString(R.string.name_alexis_H), getString(R.string.hotel_alexis_phone) +
                getString(R.string.hotel_alexis_address), R.drawable.alexis));
        words.add(new Touring(getString(R.string.name_deca_H), getString(R.string.hotel_deca_phone) +
                getString(R.string.hotel_deca_address), R.drawable.deca));
        words.add(new Touring(getString(R.string.name_paramount_H), getString(R.string.hotel_paramount_phone) +
                getString(R.string.hotel_paramount_address), R.drawable.paramount));
        words.add(new Touring(getString(R.string.name_arctic_H), getString(R.string.hotel_arctic_phone) +
                getString(R.string.hotel_arcticClub_address), R.drawable.arctic_club));
        words.add(new Touring(getString(R.string.name_four_seasons_H), getString(R.string.hotel_4seasons_phone) +
                getString(R.string.hotel_4Seasons_address), R.drawable.four_seasons));
        words.add(new Touring(getString(R.string.name_silver_cloud_H), getString(R.string.hotel_silverCloud_phone) +
                getString(R.string.hotel_silverCloud_address), R.drawable.silver_cloud));
        words.add(new Touring(getString(R.string.name_marriot_H), getString(R.string.hotel_marriot_phone) +
                getString(R.string.hotel_marriot_address), R.drawable.marriot));
        words.add(new Touring(getString(R.string.name_edgewater_H), getString(R.string.hotel_edgewater_phone) +
                getString(R.string.hotel_edgewater_address), R.drawable.edgewater));
        words.add(new Touring(getString(R.string.name_hyatt_H), getString(R.string.hotel_grandHyatt_phone) +
                getString(R.string.hotel_grandHyatt_address), R.drawable.grand_hyatt));
        words.add(new Touring(getString(R.string.name_sheraton_H), getString(R.string.hotel_sheraton_phone) +
                getString(R.string.hotel_sheraton_address), R.drawable.sheraton));
        words.add(new Touring(getString(R.string.name_watertown_H), getString(R.string.hotel_watertown_phone) +
                getString(R.string.hotel_watertown_address), R.drawable.watertown));

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