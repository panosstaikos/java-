package com.unipi.staikos.ergasia2.slide161;

public class Slide161 {

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Kostas";
        s1.AM = "P19188";
        s1.ISpeak(s1.name);
        Professor p1 = new Professor();
        p1.officeNumber = "P549";
    }
}
class Human {
    String name;
    int age;
    public void ISpeak(String name){
        System.out.println("My name is "+name);
    }
}
//Inheritance
class Student extends Human{
    String AM;
}
//Inheritance
class Professor extends Human{
    String officeNumber;
}
//Και οι δύο οι τάξεις με το extends κληρονομούν από την τάξη Human ό,τι περιέχει αλλά βάζουν νέα στοιχεία τα οποία χρησιμοποιούνται μόνο από τις συγκεκριμένες