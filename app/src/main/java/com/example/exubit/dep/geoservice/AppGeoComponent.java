package com.example.exubit.dep.geoservice;

import com.example.common.CommonComponent;
import com.example.common.scope.GeoScope;
import com.example.geoservice.GeoComponent;

import dagger.Component;

@GeoScope
@Component(dependencies = CommonComponent.class, modules = {AppGeoModuleModified.class})
public interface AppGeoComponent extends GeoComponent {

}




