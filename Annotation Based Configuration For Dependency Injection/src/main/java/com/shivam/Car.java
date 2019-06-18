package com.shivam;

import org.springframework.stereotype.Component;

/**
 * created by Shivam on 18-06-2019.
 */

// By default the name, we have to pass in the getBean(), will be the name of the class in CAMEL CASE.

// Here the default name for the @Component Annotated class is "car".
@Component
public class Car implements Vehicle {

    public void drive() {
        System.out.println("Car is running !");
    }
}
