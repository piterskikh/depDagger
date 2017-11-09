package com.example.exubit.dep.common;

import com.example.common.CommonComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppCommonModuleModified.class})
public interface AppCommonComponent extends CommonComponent{

}




