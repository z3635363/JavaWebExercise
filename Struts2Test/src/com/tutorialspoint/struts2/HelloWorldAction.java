package com.tutorialspoint.struts2;

/**
 * Created by thunder on 15/8/10.
 */
public class HelloWorldAction{
    private String name;

    public String execute() throws Exception {
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}