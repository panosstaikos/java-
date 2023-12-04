package com.unipi.staikos.ergasia2.slide191;

public class Slide191 {
    public interface IPlay{
        void play(String s);
    }
    public static void main(String[] args){
        //Implementing an existing interface
        new IPlay(){

            @Override
            public void play(String s) {
                System.out.println("I play "+s);
            }
        }.play("football");
    }
}
