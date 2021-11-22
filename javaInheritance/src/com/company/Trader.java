package com.company;

public class Trader  {

    private String name;
    private Account account;

    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }


    public void addTrade(){

    }



    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
