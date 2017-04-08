
package com.example.piyushaggarwal.tripmonkey.models;

import java.util.HashMap;
import java.util.Map;

public class O3 {

    private Double v;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getV() {
        return v;
    }

    public void setV(Double v) {
        this.v = v;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
