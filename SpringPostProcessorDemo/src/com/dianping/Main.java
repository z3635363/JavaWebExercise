package com.dianping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by thunder on 15/8/10.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        bar b = (bar)context.getBean("bar");
        foo f = (foo)context.getBean("foo");

        System.out.println(b.getPassword());
        System.out.println(f.getName());

    }
}
