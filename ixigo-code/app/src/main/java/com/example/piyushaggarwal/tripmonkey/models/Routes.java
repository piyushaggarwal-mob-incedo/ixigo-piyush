package com.example.piyushaggarwal.tripmonkey.models;

/**
 * Created by romit.srivastava on 4/8/2017.
 */

public class Routes
{
    private String fastestDuration;

    private String[] via;

    private String firstModeTypesCss;

    private String[] restModeTypesCss;

    private String allStepModes;

    private String[] modeTypesCss;

    private Steps[] steps;

    private String type;

    private String timePretty;

    private String durationPretty;

    private FirstStep firstStep;

    private String time;

    private String durationMinutes;

    private String price;

    private String timePrettySuffix;

    private String modeViaString;

    private String timeUnit;

    private String[] layOverTimes;

    private String[] modes;

    private String durationHours;

    public String getFastestDuration ()
    {
        return fastestDuration;
    }

    public void setFastestDuration (String fastestDuration)
    {
        this.fastestDuration = fastestDuration;
    }

    public String[] getVia ()
    {
        return via;
    }

    public void setVia (String[] via)
    {
        this.via = via;
    }

    public String getFirstModeTypesCss ()
    {
        return firstModeTypesCss;
    }

    public void setFirstModeTypesCss (String firstModeTypesCss)
    {
        this.firstModeTypesCss = firstModeTypesCss;
    }

    public String[] getRestModeTypesCss ()
    {
        return restModeTypesCss;
    }

    public void setRestModeTypesCss (String[] restModeTypesCss)
    {
        this.restModeTypesCss = restModeTypesCss;
    }

    public String getAllStepModes ()
    {
        return allStepModes;
    }

    public void setAllStepModes (String allStepModes)
    {
        this.allStepModes = allStepModes;
    }

    public String[] getModeTypesCss ()
    {
        return modeTypesCss;
    }

    public void setModeTypesCss (String[] modeTypesCss)
    {
        this.modeTypesCss = modeTypesCss;
    }

    public Steps[] getSteps ()
    {
        return steps;
    }

    public void setSteps (Steps[] steps)
    {
        this.steps = steps;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getTimePretty ()
    {
        return timePretty;
    }

    public void setTimePretty (String timePretty)
    {
        this.timePretty = timePretty;
    }

    public String getDurationPretty ()
    {
        return durationPretty;
    }

    public void setDurationPretty (String durationPretty)
    {
        this.durationPretty = durationPretty;
    }

    public FirstStep getFirstStep ()
    {
        return firstStep;
    }

    public void setFirstStep (FirstStep firstStep)
    {
        this.firstStep = firstStep;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getDurationMinutes ()
    {
        return durationMinutes;
    }

    public void setDurationMinutes (String durationMinutes)
    {
        this.durationMinutes = durationMinutes;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getTimePrettySuffix ()
    {
        return timePrettySuffix;
    }

    public void setTimePrettySuffix (String timePrettySuffix)
    {
        this.timePrettySuffix = timePrettySuffix;
    }

    public String getModeViaString ()
    {
        return modeViaString;
    }

    public void setModeViaString (String modeViaString)
    {
        this.modeViaString = modeViaString;
    }

    public String getTimeUnit ()
    {
        return timeUnit;
    }

    public void setTimeUnit (String timeUnit)
    {
        this.timeUnit = timeUnit;
    }

    public String[] getLayOverTimes ()
    {
        return layOverTimes;
    }

    public void setLayOverTimes (String[] layOverTimes)
    {
        this.layOverTimes = layOverTimes;
    }

    public String[] getModes ()
    {
        return modes;
    }

    public void setModes (String[] modes)
    {
        this.modes = modes;
    }

    public String getDurationHours ()
    {
        return durationHours;
    }

    public void setDurationHours (String durationHours)
    {
        this.durationHours = durationHours;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [fastestDuration = "+fastestDuration+", via = "+via+", firstModeTypesCss = "+firstModeTypesCss+", restModeTypesCss = "+restModeTypesCss+", allStepModes = "+allStepModes+", modeTypesCss = "+modeTypesCss+", steps = "+steps+", type = "+type+", timePretty = "+timePretty+", durationPretty = "+durationPretty+", firstStep = "+firstStep+", time = "+time+", durationMinutes = "+durationMinutes+", price = "+price+", timePrettySuffix = "+timePrettySuffix+", modeViaString = "+modeViaString+", timeUnit = "+timeUnit+", layOverTimes = "+layOverTimes+", modes = "+modes+", durationHours = "+durationHours+"]";
    }
}


