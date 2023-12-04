package com.unipi.staikos.ergasia2.slide41;

public class Slide41 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.age = 19;
        s1.Name = "Panagiotis";
        s1.AM = "P19161";
        s1.university = "unipi";
        System.out.println("My name is "+ s1.Name + " and I study in "+s1.university);

    }
}
class Student{
    String Name;
    String AM;
    int age;
    String university;
}
