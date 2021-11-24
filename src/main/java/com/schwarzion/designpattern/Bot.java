package com.schwarzion.designpattern;

import lombok.Data;

@Data
public class Bot implements Sender {
    /**
     * Add a new message at the end of all messages to a user
     * @param message a message.
     */
    public void post(User sender, String message, Receiver receiver) {
        // messages.add(new Message(sender, message, receiver));
    }
}
