package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an array of cityInfos
        final ArrayList<CityInfo> cityInfos = new ArrayList<CityInfo>();

        cityInfos.add(new CityInfo(getString(R.string.hotel_title_cassa),getString(R.string.hotel_description_cassa)));
        cityInfos.add(new CityInfo(getString(R.string.hotel_title_hyatt),getString(R.string.hotel_description_hyatt)));
        cityInfos.add(new CityInfo(getString(R.string.hotel_title_novotel),getString(R.string.hotel_description_novotel)));
        cityInfos.add(new CityInfo(getString(R.string.hotel_title_room_mate),getString(R.string.hotel_description_room_mate)));



        CityInfoAdapter adapter = new CityInfoAdapter(getActivity(), cityInfos, R.color.category_family);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
