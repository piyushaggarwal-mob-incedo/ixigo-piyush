
package com.example.networkrequestlib.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {

    private List<Double> geo = null;
    private String name;
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Double> getGeo() {
        return geo;
    }

    public void setGeo(List<Double> geo) {
        this.geo = geo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
