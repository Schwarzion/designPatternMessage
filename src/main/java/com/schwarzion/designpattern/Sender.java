package com.schwarzion.designpattern;

public interface Sender {
    public void post(User sender, String message, Receiver receiver);

    //ManyToMany to Message
}
