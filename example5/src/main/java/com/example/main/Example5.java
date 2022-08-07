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


    }
}