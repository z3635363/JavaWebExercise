package com.tutorialspoint;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by thunder on 15/8/7.
 */
public class MainApp {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("HelloWorld");
        obj.getMessage();
    }
}
