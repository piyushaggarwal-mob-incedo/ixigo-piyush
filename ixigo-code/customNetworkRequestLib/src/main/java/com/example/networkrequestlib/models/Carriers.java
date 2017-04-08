package com.example.networkrequestlib.models;

/**
 * Created by romit.srivastava on 4/8/2017.
 */

public class Carriers
{
    private int depTime;

    private String commaSeparatedDOO;

    private String[] busAmenitiesList;

    private String originCode;

    private String code;

    private String[] availableClassList;

    private String destinationCode;

    private int tfList;

    private String time;

    private int price;

    private String carrierName;

    private int arrTime;

    private int trainType;

    private String daysOfOperation;

    public int getDepTime ()
{
    return depTime;
}

    public void setDepTime (int depTime)
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

    public int getTfList ()
{
    return tfList;
}

    public void setTfList (int tfList)
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

    public int getPrice ()
{
    return price;
}

    public void setPrice (int price)
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

    public int getArrTime ()
{
    return arrTime;
}

    public void setArrTime (int arrTime)
    {
        this.arrTime = arrTime;
    }

    public int getTrainType ()
{
    return trainType;
}

    public void setTrainType (int trainType)
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

