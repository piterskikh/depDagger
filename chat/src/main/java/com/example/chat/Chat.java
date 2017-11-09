package com.example.chat;

import com.example.common.Common;

public class Chat {

    private static ChatComponent chatComponent;


    public static void setChatComponent(ChatComponent chatComponentValue) {
        chatComponent = chatComponentValue;
    }

    public static ChatComponent getChatComponent(){
        return chatComponent;
    }

    private Chat() {
    }

    public interface ChatModuleInterface{
        ChatText getChatText();
    }
}
