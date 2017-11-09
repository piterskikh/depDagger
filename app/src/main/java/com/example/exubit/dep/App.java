package com.example.exubit.dep;

import android.app.Application;

import com.example.chat.Chat;
import com.example.chat.ChatComponent;
import com.example.common.Common;
import com.example.common.CommonComponent;
import com.example.exubit.dep.chat.AppChatModuleModified;
import com.example.exubit.dep.common.AppCommonModuleModified;
import com.example.exubit.dep.common.DaggerAppCommonComponent;
import com.example.exubit.dep.geoservice.AppGeoModuleModified;
import com.example.exubit.dep.geoservice.DaggerAppGeoComponent;
import com.example.exubit.dep.chat.DaggerAppChatComponent;
import com.example.geoservice.Geo;
import com.example.geoservice.GeoComponent;

public class App extends Application {

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        CommonComponent commonComponent = DaggerAppCommonComponent.builder().appCommonModuleModified(new AppCommonModuleModified()).build();
        GeoComponent geoComponent = DaggerAppGeoComponent.builder().commonComponent(commonComponent).appGeoModuleModified(new AppGeoModuleModified()).build();
        ChatComponent chatComponent = DaggerAppChatComponent.builder().commonComponent(commonComponent).appChatModuleModified(new AppChatModuleModified()).build();

        Common.setCommonComponent(commonComponent);
        Geo.setGeoComponent(geoComponent);
        Chat.setChatComponent(chatComponent);

        appComponent = DaggerAppComponent.builder().commonComponent(commonComponent).build();
    }
}

