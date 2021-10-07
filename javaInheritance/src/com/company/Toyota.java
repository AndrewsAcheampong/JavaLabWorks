package com.company;

public class Toyota extends Car{

    public String wheels;
    public String steer;

    @Override
    public void horn() {
       System.out.println("Get ready to horn");
    }
}
