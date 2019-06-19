package com.shivam;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * created by Shivam on 19-06-2019.
 */


@Component
//@Primary     // As the 2 classes (Snapdragon and MediaTek) both implements MobileProcessor
            // and in Samsung class the object od=f Type MobileProcessor is needed, so there will be ambiguity
            // in selecting which Class to use, to we can use @Primary, as it will have preference over Others.

//@Qualifier("customName")
public class MediaTek implements MobileProcessor {

    public void process() {
        System.out.println("1.8 GHz Processor(MTK 222)");
    }
}
