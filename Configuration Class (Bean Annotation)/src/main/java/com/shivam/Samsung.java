package com.shivam;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * created by Shivam on 19-06-2019.
 */

public class Samsung {



    // Here to connect the following line to the AppConfig class, we can use @Autowired .
    @Autowired
    private MobileProcessor processor;


    public void config(){
        System.out.println("4GB RAM, 13MP Camera, 64GB Internal Storage, Octa Core");
        processor.process();
    }
}
