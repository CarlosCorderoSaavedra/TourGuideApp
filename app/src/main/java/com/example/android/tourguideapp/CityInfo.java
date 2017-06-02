package com.example.android.tourguideapp;

/**
 * Created by Shine on 05/05/2017.
 */

public class CityInfo {

    // Default and MiWok translation variables
    private String mTitleCityInfo;
    private String mDescriptionCityInfo;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public CityInfo(String titleCityinfo, String descriptionCityInfo){
        mTitleCityInfo = titleCityinfo;
        mDescriptionCityInfo = descriptionCityInfo;
    }

    public CityInfo(String titleCityinfo, String descriptionCityInfo, int imageResourceID){
        mTitleCityInfo = titleCityinfo;
        mDescriptionCityInfo = descriptionCityInfo;
        mImageResourceID = imageResourceID;
    }


    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getImageResourceID() {return mImageResourceID; }

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
                ", mImageResourceID=" + mImageResourceID +
                '}';
    }
}

