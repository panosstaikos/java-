package com.unipi.staikos.ergasia2.slide98;

public class Slide98 {
    int m1,m2,m3;
    public double getMO(){
        double MO;
        MO = (m1+m2+m3)/3;
        return MO;
    }
    public void example(){
        System.out.println(m1);
        System.out.println(m2);
    }
    public static void main(String[] args){
        Slide98 s = new Slide98();
        s.m1=4;
        s.m2=38;
        s.m3=467;
        int i;
        for (i=0; i<10; i++){
            System.out.println(s.getMO());
            s.m1 = s.m1 + 10;
        }
    }
}
