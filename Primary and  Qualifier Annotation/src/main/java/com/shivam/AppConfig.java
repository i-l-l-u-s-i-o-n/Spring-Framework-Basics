package com.shivam;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * created by Shivam on 19-06-2019.
 */

@Configuration
// We can directly use AppConfig class to create Objects using @Component-scan annotation.
// And also we have to Annotate the Classes with @Component whose object are required.
@ComponentScan(basePackages = "com.shivam")   // If the classes are in multiple packages , we can specify the package name separated by Comma.
public class AppConfig {
}
