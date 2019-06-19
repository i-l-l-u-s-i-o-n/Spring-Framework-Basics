package com.shivam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by Shivam on 19-06-2019.
 */

@Configuration
public class AppConfig {

    // If we are not using XML file to specify the bean Tag which is used for creating Object,
    // We can create methods to return the object and Annotate it with @Bean....

    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }
    @Bean
    public MobileProcessor getProcessor(){
        return new Snapdragon();
    }
}
