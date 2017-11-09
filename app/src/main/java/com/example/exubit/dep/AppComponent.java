package com.example.exubit.dep;


import com.example.common.scope.ApplicationScope;
import com.example.common.CommonComponent;
import com.example.exubit.dep.chat.AppChatModule;
import com.example.exubit.dep.geoservice.AppGeoModule;


import dagger.Component;

@ApplicationScope
@Component(dependencies = CommonComponent.class, modules = {AppModule.class, AppGeoModule.class, AppChatModule.class})

public interface AppComponent {

    void inject(MainActivity mainActivity);




}




