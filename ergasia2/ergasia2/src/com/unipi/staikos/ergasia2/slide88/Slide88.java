package com.unipi.staikos.ergasia2.slide88;

public class Slide88 {
    static int i=7; //static
    int j=8; //non static
    static int y=9;
    public static void main(String[] args){
        //System.out.println(i+j); ERROR
        System.out.println(i+y);

    }
}
