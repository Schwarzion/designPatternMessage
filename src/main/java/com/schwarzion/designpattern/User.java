package com.schwarzion.designpattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A user
 */
@Data
public class User implements Sender, Receiver {
    private String firstName;
    private String lastName;
    private ArrayList<Message> messages = new ArrayList<>();
    private ArrayList<Group> groups;

    /**
     * Creates a user with a first name and a last name.
     * @param firstName first name of the user.
     * @param lastName last name of the user.
     */
    public User(String firstName, String lastName) {
        this.firstName = Objects.requireNonNull(firstName);
        this.lastName = Objects.requireNonNull(lastName);
    }

    /**
     * Add a new message at the end of all messages to a user
     * @param message a message.
     */
    public void post(User sender, String message, Receiver receiver) {
        messages.add(new Message(sender, message, receiver));
    }

    public void receive(User sender, String message, Receiver receiver) {

    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }
}
