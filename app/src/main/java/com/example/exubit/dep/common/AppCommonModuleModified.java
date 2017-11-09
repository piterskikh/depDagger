package com.example.exubit.dep.common;



import com.example.common.Common;
import com.example.common.CommonText;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppCommonModuleModified implements Common.CommonModuleInterface{

    @Override
    @Provides
    @Singleton
    public CommonText getCommonText() {

        return new CommonText("Text in common bean was modified from App!!!");
    }
}
