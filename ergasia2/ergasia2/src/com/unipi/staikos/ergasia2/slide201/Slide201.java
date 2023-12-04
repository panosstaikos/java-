package com.unipi.staikos.ergasia2.slide201;
//Variables
//Anonymous Class
public class Slide201 {
    public static class Student{
        public String name;
        public int mark;
        public void speak(){
            System.out.println("Hello C++ students!!");
        }
    }
    public static void main(String[] args){
        int mark2 = 8;
        final int mark3 = 7;
        new Student(){
            int mark4 = mark3;
            private void print(){
                //mark2 = 9; ERROR, Not final
                System.out.println(mark4);
            }
        }.print();
    }
}
