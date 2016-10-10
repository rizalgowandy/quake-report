package com.example.android.quakereport;

/**
 * Created by rizalgow on 10/10/16.
 */

public class Earthquake {
    private String mScale;
    private String mLocation;
    private String mDatetime;

    public Earthquake (String scale, String location, String datetime){
        mScale = scale;
        mLocation = location;
        mDatetime = datetime;
    }

    public String getScale (){
        return  mScale;
    }

    public String getLocation (){
        return  mLocation;
    }

    public String getDatetime (){
        return  mDatetime;
    }
}
