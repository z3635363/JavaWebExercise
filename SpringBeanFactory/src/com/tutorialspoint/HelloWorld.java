package com.tutorialspoint;

/**
 * Created by thunder on 15/8/7.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your message :" + message);
    }
}
