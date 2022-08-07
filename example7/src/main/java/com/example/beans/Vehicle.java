package com.example.beans;

/**
 * Programmatically adding beans to the Spring context
 */
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("printing hello from component vehicle bean");
    }
}