package com.shivam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by Shivam on 18-06-2019.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("setting.xml");


        Vehicle obj= (Vehicle) context.getBean("car");
        obj.drive();

        // If we don't use @Autowired annotation on the private Tyre tyre; in Car class.
        // Output will be ->
        // Car is running with Tyres of brand : null

        // If we make use of @Autowired, Output will be ->
        // Car is running with Tyres of brand : Tyre{brand='MRF'}




    }
}
