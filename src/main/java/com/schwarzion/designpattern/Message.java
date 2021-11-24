package com.schwarzion.designpattern;

import lombok.Data;

import java.util.Objects;

@Data
public class Message {
    private final Sender sender;
    private final String content;
    private Receiver receiver;

    public Message(Sender sender, String content) {
        this.sender = Objects.requireNonNull(sender);
        this.content = Objects.requireNonNull(content);
    }

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
