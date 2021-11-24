package com.schwarzion.designpattern;

public interface Receiver {
    public void receive(User sender, String message, Receiver receiver);

    //ManyToMany to Message
}
