package com.unipi.staikos.ergasia2.slide190;

public class Slide190 {
    public static class Student{
        public String name;
        public int mark;
        public void speak(){
            System.out.println("Hello C++ students!!");
        }
    }
    //Extending an existing class
    public static void main(String[] args){
        new Student(){
            @Override
            public void speak() {
                System.out.println("Hello Java students!!!");
            }
        }.speak();
    }
}
