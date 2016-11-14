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
public class RestaurantFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Touring> words = new ArrayList<Touring>();
        words.add(new Touring(getString(R.string.name_crab_pot), getString(R.string.phone_crabPot)
                + getString(R.string.address_crabPot), R.drawable.crabpot));
        words.add(new Touring(getString(R.string.name_six_seven_R), getString(R.string.phone_sixSevenR)
                + getString(R.string.address_sixSeven), R.drawable.six_seven));
        words.add(new Touring(getString(R.string.name_pike_chowder_R), getString(R.string.phone_pike_place)
                + getString(R.string.address_pikePlace), R.drawable.pike_place_chowder));
        words.add(new Touring(getString(R.string.name_hilltop_ale_R), getString(R.string.phone_hilltopAle)
                + getString(R.string.address_hilltopAle), R.drawable.hilltop_ale));
        words.add(new Touring(getString(R.string.name_ruths_chris_R), getString(R.string.phone_ruthsChris)
                + getString(R.string.address_ruthChris), R.drawable.ruths_chris));
        words.add(new Touring(getString(R.string.name_skycity_R), getString(R.string.phone_skycity)
                + getString(R.string.address_skycity), R.drawable.skycity));
        words.add(new Touring(getString(R.string.name_canilis_R), getString(R.string.phone_canilis)
                + getString(R.string.address_canilis), R.drawable.canilis));
        words.add(new Touring(getString(R.string.name_manekis_R), getString(R.string.phone_manekis)
                + getString(R.string.address_manekis), R.drawable.manekis));
        words.add(new Touring(getString(R.string.name_palisade_R), getString(R.string.phone_palisadeR)
                + getString(R.string.address_palisadeR), R.drawable.palisade));
        words.add(new Touring(getString(R.string.name_brooklyn_sea_R),
                getString(R.string.phone_brooklynSea) + getString(R.string.address_brooklyn),
                R.drawable.brooklyn_seafood));
        words.add(new Touring(getString(R.string.name_metro_grill_R), getString(R.string.phone_metroGrill) +
                getString(R.string.address_metroGrill), R.drawable.metro_grill));
        words.add(new Touring(getString(R.string.name_rockcreek_R), getString(R.string.phone_rockcreek) +
                getString(R.string.address_rockcreek), R.drawable.rockcreek));
        words.add(new Touring(getString(R.string.name_taylor_shell_R),
                getString(R.string.phone_taylorShellfish) +
                        getString(R.string.address_taylorShellfish), R.drawable.taylor_shellfish));

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
