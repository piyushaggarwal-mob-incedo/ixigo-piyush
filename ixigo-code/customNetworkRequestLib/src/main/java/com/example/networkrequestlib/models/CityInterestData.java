package com.example.networkrequestlib.models;

/**
 * Created by romit.srivastava on 4/8/2017.
 */


public class CityInterestData
{
    private Hotel[] hotel;

    public Hotel[] getHotel ()
    {
        return hotel;
    }

    public void setHotel (Hotel[] hotel)
    {
        this.hotel = hotel;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [hotel = "+hotel+"]";
    }
}

