package com.unipi.staikos.ergasia2.slide99;

public class Slide99 {
    //varargs
    public static void teams(String t, int ... args){
        System.out.println("Team: "+ t);
        int i;
        for (i=0;i<args.length;i++){
            System.out.println("Number of championships: "+args[i]);
        }
    }
    public static void main(String[] args){
        teams("Olympiacos",44);
        teams("Pao",20);
        teams("Aek",13);
    }
}
