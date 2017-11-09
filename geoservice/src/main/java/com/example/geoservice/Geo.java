package com.example.geoservice;


public class Geo {

    private static GeoComponent geoComponent;


    private Geo() {
    }

    public static GeoComponent getGeoComponent(){
        return geoComponent;
    }

    public static void setGeoComponent(GeoComponent geoComponentValue) {
        geoComponent = geoComponentValue;
    }


    public interface GeoModuleInterface {
        GeoText getGeoText();
    }
}
