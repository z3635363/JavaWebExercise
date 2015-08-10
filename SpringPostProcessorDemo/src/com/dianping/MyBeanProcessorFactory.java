package com.dianping;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by thunder on 15/8/10.
 */
public class MyBeanProcessorFactory implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition foobd = beanFactory.getBeanDefinition("foo");

        MutablePropertyValues foopv = foobd.getPropertyValues();

        if(foopv.contains("name")){
            foopv.addPropertyValue("name", "thunder");
        }

    }

}
