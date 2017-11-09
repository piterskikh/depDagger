package com.example.chat;

public class Chat {

    private static ChatComponent chatComponent;


    private Chat() {
    }

    public static ChatComponent getChatComponent(){
        return chatComponent;
    }

    public static void setChatComponent(ChatComponent chatComponentValue) {
        chatComponent = chatComponentValue;
    }

    public interface ChatModuleInterface{
        ChatText getChatText();
    }
}
