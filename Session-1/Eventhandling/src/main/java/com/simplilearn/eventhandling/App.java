package com.simplilearn.eventhandling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.customevent.CustomEventPublisher;

public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        
        context.start();
        context.stop();
        
       CustomEventPublisher pub=(CustomEventPublisher) context.getBean("cep");
       pub.publish();
    }
}
