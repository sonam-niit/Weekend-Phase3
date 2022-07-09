package com.simplilearn.firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//       Resource resource= new ClassPathResource("beans.xml");
//       BeanFactory factory = new XmlBeanFactory(resource);
//    	 HelloWorld h =(HelloWorld) factory.getBean("obj");
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	HelloWorld h =(HelloWorld) context.getBean("obj");
    	h.print();
    	
    	Student s1= (Student) context.getBean("stdObj");
    	System.out.println("Id: "+s1.getId());
    	System.out.println("Name: "+s1.getName());
    	Passport p=s1.getPassport();
    	System.out.println("Passport number: "+p.getPassNo());
    }
}
