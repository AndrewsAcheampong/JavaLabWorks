package com.company;

public class Car {
    String name;
    String type;
    String Model;
    String Color;
    public int miles;

    public void horn(){
        System.out.println("The Car has the propensity to move");
    }

    public void speed(int miles){
        this.miles = miles;

    }
}
