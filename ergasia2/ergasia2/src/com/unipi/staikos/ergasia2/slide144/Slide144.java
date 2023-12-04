package com.unipi.staikos.ergasia2.slide144;

import java.util.Scanner;

public class Slide144 {
    public static void main(String[] args){
        System.out.println("Give number of month of your Birthday: ");
        Scanner month = new Scanner(System.in);
        int monthInput = month.nextInt();
        //Switch way
        switch (monthInput){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

        }
        //If way
        if (monthInput == 1)
            System.out.println("January");
        else if (monthInput == 2)
            System.out.println("February");
        else if (monthInput == 3)
            System.out.println("March");
        else if (monthInput == 4)
            System.out.println("April");
        else if (monthInput == 5)
            System.out.println("May");
        else if (monthInput == 6)
            System.out.println("June");
        else if (monthInput == 7)
            System.out.println("July");
        else if (monthInput == 8)
            System.out.println("August");
        else if (monthInput == 9)
            System.out.println("September");
        else if (monthInput == 10)
            System.out.println("October");
        else if (monthInput == 11)
            System.out.println("November");
        else if (monthInput == 12)
            System.out.println("December");
    }
}
