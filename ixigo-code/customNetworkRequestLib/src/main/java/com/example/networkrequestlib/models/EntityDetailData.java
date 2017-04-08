package com.example.networkrequestlib.models;

/**
 * Created by romit.srivastava on 4/8/2017.
 */



public class EntityDetailData
{
    private String countryName;

    private String[] categoryNames;

    private String cityId;

    private String cityName;

    private String xid;

    private String url;

    private String id;

    private String shortDescription;

    private String address;

    private String description;

    private String stateName;

    private String name;

    private String keyImageUrl;

    private String minimumPrice;

    private String whyToVisit;

    private String longitude;

    private String latitude;

    public String getCountryName ()
    {
        return countryName;
    }

    public void setCountryName (String countryName)
    {
        this.countryName = countryName;
    }

    public String[] getCategoryNames ()
    {
        return categoryNames;
    }

    public void setCategoryNames (String[] categoryNames)
    {
        this.categoryNames = categoryNames;
    }

    public String getCityId ()
    {
        return cityId;
    }

    public void setCityId (String cityId)
    {
        this.cityId = cityId;
    }

    public String getCityName ()
    {
        return cityName;
    }

    public void setCityName (String cityName)
    {
        this.cityName = cityName;
    }

    public String getXid ()
    {
        return xid;
    }

    public void setXid (String xid)
    {
        this.xid = xid;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getShortDescription ()
    {
        return shortDescription;
    }

    public void setShortDescription (String shortDescription)
    {
        this.shortDescription = shortDescription;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getStateName ()
    {
        return stateName;
    }

    public void setStateName (String stateName)
    {
        this.stateName = stateName;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getKeyImageUrl ()
    {
        return keyImageUrl;
    }

    public void setKeyImageUrl (String keyImageUrl)
    {
        this.keyImageUrl = keyImageUrl;
    }

    public String getMinimumPrice ()
    {
        return minimumPrice;
    }

    public void setMinimumPrice (String minimumPrice)
    {
        this.minimumPrice = minimumPrice;
    }

    public String getWhyToVisit ()
    {
        return whyToVisit;
    }

    public void setWhyToVisit (String whyToVisit)
    {
        this.whyToVisit = whyToVisit;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [countryName = "+countryName+", categoryNames = "+categoryNames+", cityId = "+cityId+", cityName = "+cityName+", xid = "+xid+", url = "+url+", id = "+id+", shortDescription = "+shortDescription+", address = "+address+", description = "+description+", stateName = "+stateName+", name = "+name+", keyImageUrl = "+keyImageUrl+", minimumPrice = "+minimumPrice+", whyToVisit = "+whyToVisit+", longitude = "+longitude+", latitude = "+latitude+"]";
    }
}
