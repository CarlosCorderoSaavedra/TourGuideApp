package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CityInfoAdapter extends ArrayAdapter<CityInfo> {

    private int mColorResourceId;


    public CityInfoAdapter(Activity context, ArrayList<CityInfo> cityInfos, int colorResourceId){
        super(context , 0 , cityInfos);
        mColorResourceId = colorResourceId;

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        CityInfo currentCityInfo = getItem(position);

        ImageView imageResource = (ImageView) convertView.findViewById(R.id.image_resource);
        if(currentCityInfo.hasImage()){
            imageResource.setImageResource(currentCityInfo.getImageResourceID());
        }else{
            imageResource.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = convertView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView cityInfoDescription = (TextView) convertView.findViewById(R.id.city_info_description);
        cityInfoDescription.setText(currentCityInfo.getTitleCityInfo());


        TextView cityInfoTitle = (TextView) convertView.findViewById(R.id.city_info_title);

        cityInfoTitle.setText(currentCityInfo.getDescriptionCityInfo());


        return convertView;
    }
}
