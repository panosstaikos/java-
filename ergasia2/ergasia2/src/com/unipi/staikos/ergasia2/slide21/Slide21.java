package com.unipi.staikos.ergasia2.slide21;

public class Slide21 {
    public static void main (String[]args){
        //Autoboxing
        Character c = 'c';
        char cc = c;
        System.out.println("c:'"+c+"'"+" cc:'"+cc+"'");
        Integer i = 77;
        //unboxing integer -> int
        int ii = i;
        System.out.println("i:"+i+" ii:"+ii);
    }
}
