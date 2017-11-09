package com.example.exubit.dep;


import com.example.common.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {


    @ApplicationScope
    @Provides
    public AppText getAppText() {
        return new AppText();
    }


}
