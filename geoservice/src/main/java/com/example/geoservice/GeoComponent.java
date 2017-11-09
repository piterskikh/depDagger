package com.example.geoservice;


import com.example.common.CommonComponent;
import com.example.common.scope.GeoScope;


import dagger.Component;

@GeoScope
@Component(dependencies = CommonComponent.class, modules = {GeoModule.class})
public interface GeoComponent extends Geo.GeotModuleInterface {
}




