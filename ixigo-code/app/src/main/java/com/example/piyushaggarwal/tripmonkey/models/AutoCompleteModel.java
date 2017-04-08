package com.example.piyushaggarwal.tripmonkey.models;

import java.io.Serializable;

/**
 * Created by piyush.aggarwal on 4/8/2017.
 */

public class AutoCompleteModel implements Serializable {

    AutoCompleteCity[] autoCompleteCities;

    public AutoCompleteCity[] getAutoCompleteCities() {
        return autoCompleteCities;
    }

    public void setAutoCompleteCities(AutoCompleteCity[] autoCompleteCities) {
        this.autoCompleteCities = autoCompleteCities;
    }

}
