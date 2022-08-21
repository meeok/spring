package com.example.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name ="Miranda";
    /*
    The @Autowired annotations marks on a field , constructor,setter method is used to auto-wire the beans
    that is injecting beans ie. creating the objects at runtime
    by spring DI mechanism
     */
//    @Autowired(required = false)
    private Vehicle vehicle;
  //  private final Vehicle vehicle; // for using autowiring on constructor

    //make bean as final bean .. once bean is created and injected into person bean values cannot be changed
    @Autowired
    public Person(Vehicle vehicle){
        System.out.println("Person being created by Spring");
        this.vehicle = vehicle;
    }
    //make bean as final bean .. once bean is created and injected into person bean values cannot be changed
//    @Autowired
//    public Person(){
//        System.out.println("Person being created by Spring");
//    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }

  //  @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
