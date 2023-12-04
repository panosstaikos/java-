package com.unipi.staikos.ergasia2.slide13;

import java.sql.SQLOutput;

public class Slide13 {
    public static void main (String[]args){
        char c = 'b';
        // ERROR char c = "p"
        c = (char)(c+3);
        System.out.println(c);
        //ARRAY OF CHARACTER
        char[] cArray = {'p', 'e', 't', 'e', 'r'};
        char d = 'e';
        if (c == d)
            System.out.println("c = d = '"+c+"'");
        else System.out.println("c is different from d");
    }
}
