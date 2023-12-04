package com.unipi.staikos.ergasia2.slide124;
//Mutable Strings
public class Slide124 {
    public static void main(String[] args){
        String word = "president";
        String word2 = word.replace('p','r');
        System.out.println(word2);
        //StringBuilder use
        StringBuilder builder = new StringBuilder("president");
        builder.replace(0,1,"r");
        System.out.println(builder);
    }
}
