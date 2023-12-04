package com.unipi.staikos.ergasia2.slide40;

abstract class AnonymousExample{
    public abstract void anonymousMethod();
}
public class Slide40 {
    //Static Nested Class
    static class NestedExample{
        public void nestedMethod(){
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args){
        //Static Nested Class Example
        Slide40.NestedExample nested = new NestedExample();
        nested.nestedMethod();
        //Anonymous Class Example
        AnonymousExample anonymous = new AnonymousExample(){
            public void anonymousMethod() {
                System.out.println("Anonymous Class");
            }
        };
        anonymous.anonymousMethod();
    }
}
