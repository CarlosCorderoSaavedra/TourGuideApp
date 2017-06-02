package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AirportsFragment extends Fragment {

    public AirportsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an array of cityInfos
        final ArrayList<CityInfo> cityInfos = new ArrayList<CityInfo>();

        cityInfos.add(new CityInfo(getString(R.string.airport_title_jfk),getString(R.string.airport_description_jfk)));
        cityInfos.add(new CityInfo(getString(R.string.airport_title_guardia),getString(R.string.airport_description_guardia)));
        cityInfos.add(new CityInfo(getString(R.string.airport_title_newark),getString(R.string.airport_description_newark)));

        CityInfoAdapter adapter = new CityInfoAdapter(getActivity(), cityInfos, R.color.category_colors);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}