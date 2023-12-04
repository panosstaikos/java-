package com.unipi.staikos.ergasia2.slide83;
//Abstract Class
public abstract class Slide83 {
    public abstract void Human();//Abstract method : Δεν έχει σώμα, δηλαδή δεν γράφουμε κάτι μέσα στην μέθοδο
    public void talk(){
        System.out.println("I am a human!");
    }
}
class Male extends Slide83{

    @Override
    public void Human() {
        System.out.println("I am male!");
    }
}
class MyHuman{
    public static void main(String[] args){
        Male m = new Male();
        m.talk();
        m.Human();
    }
}