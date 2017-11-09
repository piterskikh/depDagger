package com.example.exubit.dep.geoservice;

import com.example.common.scope.ApplicationScope;
import com.example.geoservice.Geo;
import com.example.geoservice.GeoComponent;
import com.example.geoservice.GeoText;


import dagger.Module;
import dagger.Provides;

@Module
public class AppGeoModule implements Geo.GeotModuleInterface{

    private GeoComponent geoComponent = Geo.getGeoComponent();

    @Override
    @Provides
    @ApplicationScope
    public GeoText getGeoText() {
        return geoComponent.getGeoText();
    }
}
