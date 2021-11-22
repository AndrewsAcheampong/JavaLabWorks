package com.company;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private final List<Trade> tradeList = new ArrayList<>();
    private double value;

//    public Account(int value) {
//        this.value = value;
//    }


    public double getValue() {
        return value;
    }

    public double setValue() {
        for(Trade t: tradeList){
            value += t.getQuantity() * t.getPrice();
        }
        return value;
    }
}
