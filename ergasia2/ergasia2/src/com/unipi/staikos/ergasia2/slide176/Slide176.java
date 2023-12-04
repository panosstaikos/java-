package com.unipi.staikos.ergasia2.slide176;

public class Slide176 {
    public static void main(String[] args){
        FootballPlayer f1 = new FootballPlayer();
        f1.name = "Guilherme";
        f1.sportName = "Football";
        f1.goalNumber = 8;
        String sport = f1.sportName;
        System.out.println("My name is "+f1.name);
        f1.speak(sport);
    }
}
class Athletes{
    String name;
    int age;
    String sportName;
}
interface ISpeak{
    void speak (String sport);
}
class FootballPlayer extends Athletes implements ISpeak{
    int goalNumber;
    @Override
    public void speak(String sport) {
        System.out.println("I play "+sport);
    }
}
class BasketballPlayer extends Athletes implements ISpeak{
    int pointsNumber;
    @Override
    public void speak(String sport) {
        System.out.println("I play "+sport);
    }
}