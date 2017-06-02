package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an array of cityInfos
        final ArrayList<CityInfo> cityInfos = new ArrayList<CityInfo>();

        cityInfos.add(new CityInfo(getString(R.string.restaurant_title_balthazar),getString(R.string.restaurant_description_balthazar), R.drawable.balthazar_restaurant));
        cityInfos.add(new CityInfo(getString(R.string.restaurant_title_blue),getString(R.string.restaurant_description_blue),R.drawable.blue_hill_restaurant));
        cityInfos.add(new CityInfo(getString(R.string.restaurant_title_daniel),getString(R.string.restaurant_description_daniel),R.drawable.daniel_restaurant));
        cityInfos.add(new CityInfo(getString(R.string.restaurant_title_georges), getString(R.string.restaurant_description_georges),R.drawable.jean_georges_restaurant));



        CityInfoAdapter adapter = new CityInfoAdapter(getActivity(), cityInfos, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

           return rootView;
    }
}