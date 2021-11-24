package com.schwarzion.designpattern;

import lombok.Data;

import java.util.Objects;

@Data
public class Message {
    private Sender sender;
    private String content;
    private Receiver receiver;
    // private static MessageList messageList;

    public Message(Sender sender, String content, Receiver receiver) {
        this.sender = Objects.requireNonNull(sender);
        this.content = Objects.requireNonNull(content);
        this.receiver = Objects.requireNonNull(receiver);
    }

    @Override
    public String toString() {
        return "Sender: "+ sender + " | Receiver: " + receiver + "-> " + content;
    }
}
