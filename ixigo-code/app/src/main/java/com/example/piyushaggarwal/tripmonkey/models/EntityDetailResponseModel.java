package com.example.piyushaggarwal.tripmonkey.models;

/**
 * Created by romit.srivastava on 4/8/2017.
 */

public class EntityDetailResponseModel
{
    private EntityDetailData data;

    public EntityDetailData getData ()
    {
        return data;
    }

    public void setData (EntityDetailData data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+"]";
    }
}
