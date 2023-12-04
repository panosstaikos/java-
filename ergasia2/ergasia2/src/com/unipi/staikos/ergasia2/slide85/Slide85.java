package com.unipi.staikos.ergasia2.slide85;
//Final class
final public class Slide85 {
    //Final variables
    final int min = 3;
    final int max = 10;
    //Final method
    final public void sayHello(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        Slide85 s = new Slide85();
        System.out.println(s.min);
        s.sayHello();
    }
}
