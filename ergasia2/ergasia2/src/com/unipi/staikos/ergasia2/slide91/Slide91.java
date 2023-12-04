package com.unipi.staikos.ergasia2.slide91;

public class Slide91 {
    int a,b,c;
    static String name = "John";
    public void getSum(int sum){
        sum = a+b+c;
        System.out.println(sum);
    }

    public static void main(String[] args){
        Slide91 s = new Slide91();
        name = "Gianna";
        System.out.println(name);
    }
}
