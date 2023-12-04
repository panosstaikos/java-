package com.unipi.staikos.ergasia2.slide173;

public class Slide173 {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.Run();
    }
}
class Vehicle{
    public void Run(){
        System.out.println("Run");
    }
}
//Method overriding
class Car extends Vehicle{
    public void Run(){
        System.out.println("Car is running!");
    }
}
