package com.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * created by Shivam on 18-06-2019.
 */

// By default the name, we have to pass in the getBean(), will be the name of the class in CAMEL CASE.

// Here the default name for the @Component Annotated class is "car".
@Component
public class Car implements Vehicle {

    // Suppose the car needs the Tyre Object.

    // So we have to use @Autowired Annotation. It will go to the XML file and check if it can create instance of Tyre class .
	// We can use @Autowired annotation on properties to get rid of the setter methods. When you will pass values of autowired properties using <property> Spring will automatically assign those properties with the passed values or references.
    @Autowired
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive() {
        System.out.println("Car is running with Tyres of brand : "+ tyre );
    }
}
