
package com.example.networkrequestlib.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

    private Float aqi;
    private Float idx;
    private List<Attribution> attributions = null;
    private City city;
    private String dominentpol;
    private Iaqi iaqi;
    private Time time;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Float getAqi() {
        return aqi;
    }

    public void setAqi(Float aqi) {
        this.aqi = aqi;
    }

    public Float getIdx() {
        return idx;
    }

    public void setIdx(Float idx) {
        this.idx = idx;
    }

    public List<Attribution> getAttributions() {
        return attributions;
    }

    public void setAttributions(List<Attribution> attributions) {
        this.attributions = attributions;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getDominentpol() {
        return dominentpol;
    }

    public void setDominentpol(String dominentpol) {
        this.dominentpol = dominentpol;
    }

    public Iaqi getIaqi() {
        return iaqi;
    }

    public void setIaqi(Iaqi iaqi) {
        this.iaqi = iaqi;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
