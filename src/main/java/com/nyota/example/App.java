package com.nyota.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfiguration.class); 
        BusinessService service = context.getBean(BusinessService.class); 
        service.getAddition(10, 20);
    }
}
