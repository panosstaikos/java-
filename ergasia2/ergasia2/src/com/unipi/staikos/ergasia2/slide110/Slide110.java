package com.unipi.staikos.ergasia2.slide110;
//Method Overloading
public class Slide110 {
    static int Sum (int mark1, int mark2){
        return mark1 + mark2;
    }
    static double Sum (double mark1, double mark2){
        return mark1 + mark2;
    }
    public static void main(String[] args){
        int ex1 = Sum(19,17);
        double ex2 = Sum(15.5, 18.6);
        System.out.println("First result: "+ex1);
        System.out.println("Second result: "+ex2);
    }
}
