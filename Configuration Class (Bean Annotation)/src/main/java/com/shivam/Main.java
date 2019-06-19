package com.shivam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created by Shivam on 19-06-2019.
 */
public class Main {


    public static void main(String[] args) {


        // We can use applicationContext to create Objects.
        // Here if do not want to use XML file the way we initialise ApplicationContext Class is ->
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);   // Here we have to specify the configuration CLass.


        // Creating the object
        Samsung edge = factory.getBean(Samsung.class);
        edge.config();


        // Output- >
        // 4GB RAM, 13MP Camera, 64GB Internal Storage, Octa Core
        // 2.00 GHz Processor(SD 625)



    }
}

