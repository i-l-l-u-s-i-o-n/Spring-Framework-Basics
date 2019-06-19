package com.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


/**
 * created by Shivam on 19-06-2019.
 */

@Component
public class Samsung {



    // Here to connect the following line to the AppConfig class, we can use @Autowired .
    @Autowired

    // In case we do not use @Primary, we can also use @Qualifier() with name of the class in Camel Case.
    // We can also specify customNames to the class by annotating it with @Qualifier("name") and the we can use @Qualifier("name") here.
    @Qualifier("mediaTek") // Default name (MediaTek in camelCase - mediaTek)
    private MobileProcessor processor;


    public void config(){
        System.out.println("4GB RAM, 13MP Camera, 64GB Internal Storage, Octa Core");
        processor.process();
    }
}
