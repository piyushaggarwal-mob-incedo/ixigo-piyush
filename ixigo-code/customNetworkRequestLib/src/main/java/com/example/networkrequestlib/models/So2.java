
package com.example.networkrequestlib.models;

import java.util.HashMap;
import java.util.Map;

public class So2 {

    private Float v;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Float getV() {
        return v;
    }

    public void setV(Float v) {
        this.v = v;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
