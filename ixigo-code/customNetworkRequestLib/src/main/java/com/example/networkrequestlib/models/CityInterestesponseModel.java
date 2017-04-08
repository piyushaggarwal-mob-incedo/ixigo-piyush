package com.example.networkrequestlib.models;

/**
 * Created by romit.srivastava on 4/8/2017.
 */

public class CityInterestesponseModel
{
    private CityInterestData data;

    public CityInterestData getData ()
    {
        return data;
    }

    public void setData (CityInterestData data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+"]";
    }
}