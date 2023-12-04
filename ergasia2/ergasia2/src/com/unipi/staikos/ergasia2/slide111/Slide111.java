package com.unipi.staikos.ergasia2.slide111;

public class Slide111 {
    public static String color;
    public static char size;
    //Constructors
    Slide111(){}
    Slide111(String newColor, char newSize){
        color = newColor;
        size = newSize;
    }
    public static void main(String[] args){
        Slide111 s = new Slide111("Red",'L');
        System.out.println(s.color);
        System.out.println(s.size);
    }
}
