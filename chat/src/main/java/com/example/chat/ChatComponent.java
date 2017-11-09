package com.example.chat;



import com.example.common.scope.ChatScope;
import com.example.common.CommonComponent;

import dagger.Component;

@ChatScope
@Component(dependencies = CommonComponent.class, modules = {ChatModule.class})
public interface ChatComponent extends Chat.ChatModuleInterface {
}




