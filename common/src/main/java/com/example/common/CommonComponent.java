package com.example.common;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CommonModule.class})
public interface CommonComponent extends Common.CommonModuleInterface {
}




