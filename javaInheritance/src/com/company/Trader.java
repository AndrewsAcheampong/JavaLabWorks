package com.company;

public class Trader<Private, trade> {

    private String name;
    private Account account;
    private Trade trade;

    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }


    public void addTrade(Trade newTrade){

        double value = newTrade.getPrice() * newTrade.getPrice();
        account.setValue();

    }

    public double getTraderAccountTotal(){
        return account.getValue();
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
