package com.company;

import java.util.Objects;

public class Trade {
    private int id;
    private String symbol;
    private int quantity;
    private double price;


    public Trade(int id , String symbol , int quantity , double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }


    //A new Constructor that does not take price
    public Trade(int id, String symbol , int quantity){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public double setPrice(double price) {

        //Validating to receive the right prices
        if(price < 0){
            price = 0;

        }else{

            this.price = price;
        }

        return price;

    }

    public int getId() {
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return id == trade.id && quantity == trade.quantity && Double.compare(trade.price, price) == 0 && Objects.equals(symbol, trade.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, symbol, quantity, price);
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
