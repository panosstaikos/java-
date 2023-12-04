package com.unipi.staikos.ergasia2.slide122;

import java.util.Scanner;

public class Slide122 {
    public static void main(String[] args){
        System.out.println("Give your best color: ");
        Scanner color = new Scanner(System.in);
        String colorInput = color.next();
        //Σύγκριση διεύθυνσεων
        if (colorInput == "red"){
            System.out.println("My favorite color is red");
        }
        else
            System.out.println("My favorite color is not red");
        //Σύγκριση τιμών
        if (colorInput.equals("red")){
            System.out.println("My favorite color is red");
        }
        else
            System.out.println("My favorite color is not red");
        //Παρατηρούμε διαφορετικό αποτέλεσμα
    }
}
