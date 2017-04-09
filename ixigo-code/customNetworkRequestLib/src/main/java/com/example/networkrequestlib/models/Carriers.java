package com.example.networkrequestlib.models;

import java.lang.reflect.Array;

/**
 * Created by romit.srivastava on 4/8/2017.
 */

public class Carriers
{
    private String depTime;

    private String commaSeparatedDOO;

    private String[] busAmenitiesList;

    private String originCode;

    private String code;

    private String[] availableClassList;

    private String destinationCode;

    private Array[] tfList;

    private String time;

    private String price;

    private String carrierName;

    private String arrTime;

    private String trainType;

    private String daysOfOperation;

    public String getDepTime ()
{
    return depTime;
}

    public void setDepTime (String depTime)
    {
        this.depTime = depTime;
    }

    public String getCommaSeparatedDOO ()
    {
        return commaSeparatedDOO;
    }

    public void setCommaSeparatedDOO (String commaSeparatedDOO)
    {
        this.commaSeparatedDOO = commaSeparatedDOO;
    }

    public String[] getBusAmenitiesList ()
    {
        return busAmenitiesList;
    }

    public void setBusAmenitiesList (String[] busAmenitiesList)
    {
        this.busAmenitiesList = busAmenitiesList;
    }

    public String getOriginCode ()
    {
        return originCode;
    }

    public void setOriginCode (String originCode)
    {
        this.originCode = originCode;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String[] getAvailableClassList ()
    {
        return availableClassList;
    }

    public void setAvailableClassList (String[] availableClassList)
    {
        this.availableClassList = availableClassList;
    }

    public String getDestinationCode ()
    {
        return destinationCode;
    }

    public void setDestinationCode (String destinationCode)
    {
        this.destinationCode = destinationCode;
    }

    public Array[] getTfList ()
{
    return tfList;
}

    public void setTfList (Array[] tfList)
    {
        this.tfList = tfList;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getPrice ()
{
    return price;
}

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getCarrierName ()
    {
        return carrierName;
    }

    public void setCarrierName (String carrierName)
    {
        this.carrierName = carrierName;
    }

    public String getArrTime ()
{
    return arrTime;
}

    public void setArrTime (String arrTime)
    {
        this.arrTime = arrTime;
    }

    public String getTrainType ()
{
    return trainType;
}

    public void setTrainType (String trainType)
    {
        this.trainType = trainType;
    }

    public String getDaysOfOperation ()
    {
        return daysOfOperation;
    }

    public void setDaysOfOperation (String daysOfOperation)
    {
        this.daysOfOperation = daysOfOperation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [depTime = "+depTime+", commaSeparatedDOO = "+commaSeparatedDOO+", busAmenitiesList = "+busAmenitiesList+", originCode = "+originCode+", code = "+code+", availableClassList = "+availableClassList+", destinationCode = "+destinationCode+", tfList = "+tfList+", time = "+time+", price = "+price+", carrierName = "+carrierName+", arrTime = "+arrTime+", trainType = "+trainType+", daysOfOperation = "+daysOfOperation+"]";
    }
}

