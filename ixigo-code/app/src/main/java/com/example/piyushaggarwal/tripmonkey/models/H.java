
package com.example.piyushaggarwal.tripmonkey.models;

import java.util.HashMap;
import java.util.Map;

public class H {

    private Integer v;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
