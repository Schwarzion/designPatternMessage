package com.schwarzion.designpattern;

import java.util.ArrayList;
import lombok.Data;

@Data
public final class MessageList {
    private static MessageList messageList = null;
    private static ArrayList<String> messages = new ArrayList<>();

    private MessageList() {}

    public static MessageList getMessageListInstance()
    {
        if (messageList == null)
        {
            messageList = new MessageList();
        }
        return messageList;
    }

    static void addMessage(String e) {
        messages.add(e);
    }

    static void printMessages() {
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
