package com.shivam;

import com.shivam.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by Shivam on 18-06-2019.
 */
public class Main {

    public static void main(String[] args) {




        // For small applications, we can use BeanFactory, but for large Enterprise Application we use ApplicationContext.
        ApplicationContext context=new ClassPathXmlApplicationContext("setting.xml");


        // We can assign a @Component annotation to the class, and it will be automatically used for creating the object.
        // We have to just specify the name of component annotated class in the Camel Case.


        // We also have to configure our XML file to indicate the package in which the Component class Lies.
        Vehicle obj= (Vehicle) context.getBean("car");
        obj.drive();


    }
}
