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

        Tyre tyre= (Tyre) context.getBean("tyre");
        // To set the value of brand in the Tyre class using constructor, we have to use the constructor-args Tag in the XML.

        System.out.println(tyre);


    }
}
