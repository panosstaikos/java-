package com.unipi.staikos.ergasia2.slide184;

public class Slide184 {
    public static void main(String[] args){
        //Casting int -> double
        int num = 100;
        System.out.println("int: "+num);
        double num2 = num;
        System.out.println("double: "+ num2);
        //Casting double -> int
        double num3 = 8.66;
        System.out.println("double: "+num3);
        int num4 = (int)num3;
        System.out.println("int: "+ num4);
        //Casting int -> String
        int num5 = 65;
        System.out.println("int: "+num5);
        String num6 = String.valueOf(num5);
        System.out.println("String: "+num6);
        //Casting String -> int
        String num7 = "10";
        System.out.println("String: "+num7);
        int num8 = Integer.parseInt(num7);
        System.out.println("int: "+num8);
    }
}
