package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//post and pre...
@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    //using @postconstruct anotation .. tells spring to execute this code snippet after creating objects
    @PostConstruct
    public void initialize() {
        this.name = "Honda";
    }
    @PreDestroy //calls this method before destroying/clearing the objects
    public void destroy(){
        System.out.println("Destroying Vehicle beans");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("printing hello from component vehicle bean");
    }
}