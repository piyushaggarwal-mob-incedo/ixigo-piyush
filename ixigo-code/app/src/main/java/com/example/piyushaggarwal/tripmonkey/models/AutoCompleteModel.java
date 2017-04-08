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

    public class AutoCompleteCity {
        String _id, url, text;
        double lat, lon;
        int xid;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public int getXid() {
            return xid;
        }

        public void setXid(int xid) {
            this.xid = xid;
        }
    }
}
