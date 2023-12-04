package com.unipi.staikos.ergasia2.slide66;

class P{
    public String name = "Nikos";
    private int age = 33;
    private void message(){
        System.out.println("Hello Unipi !!!");
    }
    protected void mess(){
        System.out.println("Hello World");
    }
}
public class Slide66 {
    public static void main(String args[]){
        P p1 = new P();
        //p1.message(); ERROR!! επειδή η συνάρτηση είναι private
        System.out.println("Hello my name is "+p1.name); //Επειδή είναι δηλωμένη η μεταβλητή public μπορούμε να το γράψουμε
        p1.mess();
    }
}
