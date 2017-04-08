
package com.example.piyushaggarwal.tripmonkey.models;

import java.util.HashMap;
import java.util.Map;

public class RecommendationAPIResponseModel {

    private DataRecommendationAPI data;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public DataRecommendationAPI getData() {
        return data;
    }

    public void setData(DataRecommendationAPI data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
