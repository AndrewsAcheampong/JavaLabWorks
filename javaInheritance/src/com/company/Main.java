package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Trade trade = new Trade(02 , "AAPL" , 20 , 10.00);
        System.out.println(trade.setPrice(-2));

        Account account = new Account();
        System.out.println(account.getValue());

    }
}
