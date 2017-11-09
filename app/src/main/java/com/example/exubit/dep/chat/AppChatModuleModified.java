package com.example.exubit.dep.chat;



import com.example.chat.Chat;
import com.example.chat.ChatText;
import com.example.common.scope.ChatScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppChatModuleModified implements Chat.ChatModuleInterface{

    @Override
    @Provides
    @ChatScope
    public ChatText getChatText() {

        return new ChatText("Text in Chat bean was created into the App!!!");
    }
}
