package com.example.exubit.dep.chat;

import com.example.chat.ChatComponent;
import com.example.common.CommonComponent;
import com.example.common.scope.ChatScope;

import dagger.Component;

@ChatScope
@Component(dependencies = CommonComponent.class, modules = {AppChatModuleModified.class})
public interface AppChatComponent extends ChatComponent {

}




