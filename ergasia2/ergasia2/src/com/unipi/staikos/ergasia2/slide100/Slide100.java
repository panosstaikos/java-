package com.unipi.staikos.ergasia2.slide100;
class Animal{

}
class Lion extends Animal{

}
public class Slide100 {
    public static void main(String[] args){
        String name = "Antony";
        int age = 8;
        System.out.println("Is name an instance of String: "+(name instanceof String));
        Lion l1 = new Lion();
        //Ελέγχουμε αν το l1 είναι αντικείμενο του Lion
        System.out.println("Is l1 an instance of Lion: "+(l1 instanceof Lion));
        //Ελέγχουμε αν το l1 είναι αντικείμενο του Αnimal
        System.out.println("Is l1 an instance of Animal: "+(l1 instanceof Animal));
    }
}
