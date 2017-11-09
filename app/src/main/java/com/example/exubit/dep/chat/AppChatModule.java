package com.example.exubit.dep.chat;

import com.example.chat.Chat;
import com.example.chat.ChatComponent;
import com.example.chat.ChatText;
import com.example.common.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppChatModule implements Chat.ChatModuleInterface{

    private ChatComponent chatComponent = Chat.getChatComponent();

    @Override
    @Provides
    @ApplicationScope
    public ChatText getChatText() {
        return chatComponent.getChatText();
    }
}
