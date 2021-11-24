package com.schwarzion.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        MessageList.addMessage("Test");
        MessageList.printMessages();
        MessageList.addMessage("toto");
        MessageList.printMessages();
    }
}
