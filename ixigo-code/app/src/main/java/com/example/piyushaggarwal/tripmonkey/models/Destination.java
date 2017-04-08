package com.example.piyushaggarwal.tripmonkey.models;

/**
 * Created by romit.srivastava on 4/8/2017.
 */

public class Destination
{
    private String id;

    private String name;

    private String state;

    private String xid;

    private String lng;

    private String mongoId;

    private String lat;

    private String country;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getXid ()
    {
        return xid;
    }

    public void setXid (String xid)
    {
        this.xid = xid;
    }

    public String getLng ()
    {
        return lng;
    }

    public void setLng (String lng)
    {
        this.lng = lng;
    }

    public String getMongoId ()
    {
        return mongoId;
    }

    public void setMongoId (String mongoId)
    {
        this.mongoId = mongoId;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", name = "+name+", state = "+state+", xid = "+xid+", lng = "+lng+", mongoId = "+mongoId+", lat = "+lat+", country = "+country+"]";
    }
}

