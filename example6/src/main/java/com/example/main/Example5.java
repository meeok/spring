package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //using @component annotation
        Vehicle v = context.getBean(Vehicle.class);
        System.out.println("component Vehicle name from spring context is: " +v.getName());
        v.printHello();
        context.close();

        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        //@primary anotation
       /* var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("primary name from spring context is: "+veh.getName());
        */


    }
}