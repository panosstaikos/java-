package com.unipi.staikos.ergasia2.slide127;

import java.util.ArrayList;
import java.util.List;

public class Slide127 {
    String teamName;
    public static void main(String[] args){
        //Create a list
        List<Slide127> teamsList = new ArrayList<>();
        //Add elements to the list
        Slide127 s1 =new Slide127();
        s1.teamName = "Olympiacos";
        Slide127 s2 =new Slide127();
        s2.teamName = "Pao";
        Slide127 s3 =new Slide127();
        s3.teamName = "Aek";
        Slide127 s4=new Slide127();
        s4.teamName = "Aris";
        Slide127 s5 =new Slide127();
        s5.teamName = "Paok";
        Slide127 s6=new Slide127();
        s6.teamName = "Panaitolikos";
        teamsList.add(s1);
        teamsList.add(s2);
        teamsList.add(s3);
        teamsList.add(s4);
        teamsList.add(s5);
        teamsList.add(s6);
        //Access and print all elements
        for (Slide127 s : teamsList){
            System.out.println(s.teamName);
        }
        //Change element
        Slide127 s7 = new Slide127();
        s7.teamName = "Atromitos";
        teamsList.set(4, s7);
        System.out.println("New List");
        for (Slide127 s : teamsList){
            System.out.println(s.teamName);
        }
        //Delete element
        teamsList.remove(4);
        System.out.println("New list");
        for (Slide127 s : teamsList){
            System.out.println(s.teamName);
        }
    }
}
