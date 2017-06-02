package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SharedExperiencesFragment extends Fragment {

    public SharedExperiencesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an array of cityInfos
        final ArrayList<CityInfo> cityInfos = new ArrayList<CityInfo>();

        cityInfos.add(new CityInfo(getString(R.string.experiences_title_pepe),getString(R.string.experiences_description_pepe)));
        cityInfos.add(new CityInfo(getString(R.string.experiences_title_sara),getString(R.string.experiences_description_sara)));
        cityInfos.add(new CityInfo(getString(R.string.experiences_title_peter),getString(R.string.experiences_description_peter)));
        cityInfos.add(new CityInfo(getString(R.string.experiences_title_tony),getString(R.string.experiences_description_tony)));

        CityInfoAdapter adapter = new CityInfoAdapter(getActivity(), cityInfos, R.color.category_phrases);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
