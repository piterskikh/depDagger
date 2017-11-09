package com.example.common;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
class CommonModule implements Common.CommonModuleInterface {

    @Override
    @Provides
    @Singleton
    public CommonText getCommonText() {
        return null;
    }


}
