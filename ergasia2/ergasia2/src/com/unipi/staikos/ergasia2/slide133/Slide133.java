package com.unipi.staikos.ergasia2.slide133;

import java.util.ArrayList;
import java.util.ListIterator;

public class Slide133 {
    public static void main(String[] args){
        ArrayList<String> teams = new ArrayList<>();
        teams.add("Olympiacos");
        teams.add("Panathinaikos");
        teams.add("AEK");
        teams.add("Paok");

        teams.add(2,"Aris");

        for (String t : teams){
            teams.set(1,"Pao");
            //teams.remove(4); error!
            //teams.add("Atromitos"); error!
            System.out.println(t);
        }
        ListIterator<String> iterator = teams.listIterator();
        while (iterator.hasNext()){
            teams.set(1,"Pao");
            //teams.remove(4); error!
            //teams.add("Atromitos"); error!
            System.out.println(iterator.next());
        }
        for (int i = 0; i<5; i++){
            teams.set(1,"Pao");
            //teams.remove(4); error!
            //teams.add(5,"Atromitos"); Εμφανίζεται η λίστα αλλά χωρίς να προσθέτει το στοιχείο!
            System.out.println(teams.get(i));
        }
    }
}
