package com.unipi.staikos.ergasia2.slide5;

//Create Class
public class Slide5 {
    //Examples
    public String Name;
    public String AM;
    int weight = 75;
    private int age;
    String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else System.out.println("No negative age!!");
    }

    //Create Object
    public static void main(String[] args) {
        Slide5 myObject = new Slide5();
        System.out.println(myObject.weight);
    }
}


