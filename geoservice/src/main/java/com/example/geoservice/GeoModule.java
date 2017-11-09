package com.example.geoservice;


import com.example.common.scope.GeoScope;


import dagger.Module;
import dagger.Provides;


@Module
public class GeoModule implements Geo.GeotModuleInterface{

    @Override
    @GeoScope
    @Provides
    public GeoText getGeoText() {
        return null;
    }
}
