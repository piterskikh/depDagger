package com.example.geoservice;

import com.example.common.Common;


public class Geo {

    private static GeoComponent geoComponent;


    public static void setGeoComponent(GeoComponent geoComponentValue) {
        geoComponent = geoComponentValue;
    }

    public static GeoComponent getGeoComponent(){
        return geoComponent;
    }

    private Geo() {
    }


    public interface GeotModuleInterface {
        GeoText getGeoText();
    }
}
