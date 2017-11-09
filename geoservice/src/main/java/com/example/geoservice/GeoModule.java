package com.example.geoservice;


import com.example.common.scope.GeoScope;

import dagger.Module;
import dagger.Provides;


@Module
class GeoModule implements Geo.GeoModuleInterface {

    @Override
    @GeoScope
    @Provides
    public GeoText getGeoText() {
        return null;
    }
}
