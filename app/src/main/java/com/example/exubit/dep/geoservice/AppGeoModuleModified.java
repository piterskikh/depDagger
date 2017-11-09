package com.example.exubit.dep.geoservice;


import com.example.common.scope.GeoScope;
import com.example.geoservice.Geo;
import com.example.geoservice.GeoText;

import dagger.Module;
import dagger.Provides;

@Module
public class AppGeoModuleModified implements Geo.GeoModuleInterface {

    @Override
    @Provides
    @GeoScope
    public GeoText getGeoText() {

        return new GeoText("Text in Geo bean was created into the App!!!");
    }
}
