package com.example.chat;


import com.example.common.scope.ChatScope;


import dagger.Module;
import dagger.Provides;

@Module
public class ChatModule implements Chat.ChatModuleInterface {

    @Override
    @ChatScope
    @Provides
    public ChatText getChatText() {
        return null;
    }


}
