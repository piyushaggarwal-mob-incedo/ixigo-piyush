package com.example.networkrequestlib.models;

/**
 * Created by romit.srivastava on 4/8/2017.
 */

public class A2BResponseModel
{
    private A2BData data;

    public A2BData getData ()
    {
        return data;
    }

    public void setData (A2BData data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+"]";
    }
}
