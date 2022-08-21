package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }


    // wiring bean using method calls
    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Miranda");
        person.setVehicle(vehicle());    // wiring bean using method calls
        return person;
    }

    // wiring bean using method parameters
    @Bean
    public Person person(Vehicle vehicle){
        Person person = new Person();
        person.setName("Miranda");
        //person.setVehicle(vehicle());    // wiring bean using method calls --calss vehicle constructor
        person.setVehicle(vehicle);    // wiring bean using method calls --calss vehicle constructor
        return person;
    }

}