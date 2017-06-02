package com.example.android.tourguideapp;

/**
 * Created by Shine on 05/05/2017.
 */

public class CityInfo {

    // Default and MiWok translation variables
    private String mTitleCityInfo;
    private String mDescriptionCityInfo;


    public CityInfo(String titleCityinfo, String descriptionCityInfo){
        mTitleCityInfo = titleCityinfo;
        mDescriptionCityInfo = descriptionCityInfo;
    }

    //Getters to get the default and the miWok translation words
    public String getTitleCityInfo(){
        return mTitleCityInfo;
    }

    public String getDescriptionCityInfo(){
        return mDescriptionCityInfo;
    }


    @Override
    public String toString() {
        return "CityInfo{" +
                "mTitleCityInfo='" + mTitleCityInfo + '\'' +
                ", mDescriptionCityInfo='" + mDescriptionCityInfo + '\'' +
                '}';
    }
}

