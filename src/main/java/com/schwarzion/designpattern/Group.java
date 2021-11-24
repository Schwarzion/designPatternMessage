package com.schwarzion.designpattern;

import lombok.Data;

@Data
public class Group implements Receiver {
    public void receive(User sender, String message, Receiver receiver) {}
}
