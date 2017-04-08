package com.example.piyushaggarwal.tripmonkey.models;

/**
 * Created by romit.srivastava on 4/8/2017.
 */


public class A2BData
{
    private String direct;

    private String directIndirectSentence;

    private String fastOrgDst;

    private String sort;

    private String showSummary;

    private FastestRoute fastestRoute;

    private Origin origin;

    private String destinationName;

    private String directBus;

    private Destination destination;

    private String distance;

    private Routes[] routes;

    private String noModesPossible;

    private String multiModes;

    private String directFlight;

    private String modes;

    private String directCar;

    private String originAirportCode;

    private CheapestRoute cheapestRoute;

    private String chepOrgDst;

    private String resCount;

    private String originName;

    private String directTrain;

    public String getDirect ()
    {
        return direct;
    }

    public void setDirect (String direct)
    {
        this.direct = direct;
    }

    public String getDirectIndirectSentence ()
    {
        return directIndirectSentence;
    }

    public void setDirectIndirectSentence (String directIndirectSentence)
    {
        this.directIndirectSentence = directIndirectSentence;
    }

    public String getFastOrgDst ()
    {
        return fastOrgDst;
    }

    public void setFastOrgDst (String fastOrgDst)
    {
        this.fastOrgDst = fastOrgDst;
    }

    public String getSort ()
    {
        return sort;
    }

    public void setSort (String sort)
    {
        this.sort = sort;
    }

    public String getShowSummary ()
    {
        return showSummary;
    }

    public void setShowSummary (String showSummary)
    {
        this.showSummary = showSummary;
    }

    public FastestRoute getFastestRoute ()
    {
        return fastestRoute;
    }

    public void setFastestRoute (FastestRoute fastestRoute)
    {
        this.fastestRoute = fastestRoute;
    }

    public Origin getOrigin ()
    {
        return origin;
    }

    public void setOrigin (Origin origin)
    {
        this.origin = origin;
    }

    public String getDestinationName ()
    {
        return destinationName;
    }

    public void setDestinationName (String destinationName)
    {
        this.destinationName = destinationName;
    }

    public String getDirectBus ()
    {
        return directBus;
    }

    public void setDirectBus (String directBus)
    {
        this.directBus = directBus;
    }

    public Destination getDestination ()
    {
        return destination;
    }

    public void setDestination (Destination destination)
    {
        this.destination = destination;
    }

    public String getDistance ()
    {
        return distance;
    }

    public void setDistance (String distance)
    {
        this.distance = distance;
    }

    public Routes[] getRoutes ()
    {
        return routes;
    }

    public void setRoutes (Routes[] routes)
    {
        this.routes = routes;
    }

    public String getNoModesPossible ()
    {
        return noModesPossible;
    }

    public void setNoModesPossible (String noModesPossible)
    {
        this.noModesPossible = noModesPossible;
    }

    public String getMultiModes ()
    {
        return multiModes;
    }

    public void setMultiModes (String multiModes)
    {
        this.multiModes = multiModes;
    }

    public String getDirectFlight ()
    {
        return directFlight;
    }

    public void setDirectFlight (String directFlight)
    {
        this.directFlight = directFlight;
    }

    public String getModes ()
    {
        return modes;
    }

    public void setModes (String modes)
    {
        this.modes = modes;
    }

    public String getDirectCar ()
    {
        return directCar;
    }

    public void setDirectCar (String directCar)
    {
        this.directCar = directCar;
    }

    public String getOriginAirportCode ()
    {
        return originAirportCode;
    }

    public void setOriginAirportCode (String originAirportCode)
    {
        this.originAirportCode = originAirportCode;
    }

    public CheapestRoute getCheapestRoute ()
    {
        return cheapestRoute;
    }

    public void setCheapestRoute (CheapestRoute cheapestRoute)
    {
        this.cheapestRoute = cheapestRoute;
    }

    public String getChepOrgDst ()
    {
        return chepOrgDst;
    }

    public void setChepOrgDst (String chepOrgDst)
    {
        this.chepOrgDst = chepOrgDst;
    }

    public String getResCount ()
    {
        return resCount;
    }

    public void setResCount (String resCount)
    {
        this.resCount = resCount;
    }

    public String getOriginName ()
    {
        return originName;
    }

    public void setOriginName (String originName)
    {
        this.originName = originName;
    }

    public String getDirectTrain ()
    {
        return directTrain;
    }

    public void setDirectTrain (String directTrain)
    {
        this.directTrain = directTrain;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [direct = "+direct+", directIndirectSentence = "+directIndirectSentence+", fastOrgDst = "+fastOrgDst+", sort = "+sort+", showSummary = "+showSummary+", fastestRoute = "+fastestRoute+", origin = "+origin+", destinationName = "+destinationName+", directBus = "+directBus+", destination = "+destination+", distance = "+distance+", routes = "+routes+", noModesPossible = "+noModesPossible+", multiModes = "+multiModes+", directFlight = "+directFlight+", modes = "+modes+", directCar = "+directCar+", originAirportCode = "+originAirportCode+", cheapestRoute = "+cheapestRoute+", chepOrgDst = "+chepOrgDst+", resCount = "+resCount+", originName = "+originName+", directTrain = "+directTrain+"]";
    }
}

