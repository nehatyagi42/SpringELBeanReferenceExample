package com.rtpl.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
    
    	Customer customer = (Customer) context.getBean("customerBean");
    	
        System.out.println(customer);
}
}