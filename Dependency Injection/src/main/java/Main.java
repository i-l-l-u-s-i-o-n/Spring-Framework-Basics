import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by Shivam on 18-06-2019.
 */
public class Main {

    public static void main(String[] args) {



        // If we do not use spring framework, following causes the High Coupling !

        // If we directly use class to create object.
        // Car car=new Car();
        // In case if we have to change the Type of Vehicle such as Bike, we have to change the Source code.

        // If we use the Interface, then we have to make change at one side if we want a different vehicle.
        // Vehicle obj=new Bike();

        // So we have to RECOMPILE the code, whenever we change our code !!!!!!!!!


        // ==============================================================================  //
        // Spring Framework provides us the service to remove such type of dependency using the XML file.

        // For this we can use BeanFactory or ApplicationContext class.

        // For small applications, we can use BeanFactory, but for large Enterprise Application we use ApplicationContext.
        ApplicationContext context=new ClassPathXmlApplicationContext("setting.xml");


        // Here we can assign the "vehicle" ti the "id" of any bean (Car or Bike) in XML, and we DO NOT NEED TO RECOMPILE the file,
        // We can directly make changes to the external XML file and we can see the changes in the Output without Recompiling!!!!!!!
        // That's the beauty of Spring and called "DEPENDENCY INJECTION" as we can inject the dependency EXTERNALLY......
        Vehicle obj= (Vehicle) context.getBean("vehicle");
        obj.drive();


    }
}
