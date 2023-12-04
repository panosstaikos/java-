package com.unipi.staikos.ergasia2.slide104;

class Vehicles{
    int speed = 140;
    Vehicles(){
        System.out.println("Constructor!");
    }
}
class Bicycle extends Vehicles{
    int speed = 40;
    public void display(){
        System.out.println(speed);
        //how to use super
        System.out.println(super.speed);
    }
    Bicycle(){
        //super in constructor
        super();
        System.out.println("Bicycle constructor!");
    }
}
public class Slide104 {
    int a;
    int b;
    public void setData(int a,int b){
        //how to use "this"
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args){
        Slide104 s1 = new Slide104();
        s1.setData(1,2);
        System.out.println(s1.a);
        System.out.println(s1.b);

        Bicycle b =new Bicycle();
        b.display();
    }
}
