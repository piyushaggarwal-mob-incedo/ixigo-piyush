
package com.example.piyushaggarwal.tripmonkey.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataRecommendationAPI {

    private List<Flight> flight = null;
    private List<BudgetFlight> budgetFlight = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Flight> getFlight() {
        return flight;
    }

    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }

    public List<BudgetFlight> getBudgetFlight() {
        return budgetFlight;
    }

    public void setBudgetFlight(List<BudgetFlight> budgetFlight) {
        this.budgetFlight = budgetFlight;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
