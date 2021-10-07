package com.company;

public class Trade {

        String ID;
        String Symbol;
        int quantity;
        private double price;

        public Trade(String ID, String Symbol, int quantity, double price){
            this.ID = ID;
            this.Symbol = Symbol;
            this.quantity = quantity;
            this.setPrice(price);
        }

        public Trade(String ID, String Symbol, int quantity){
            this.ID = ID;
            this.Symbol = Symbol;
            this.quantity = quantity;
        }

    public double getPrice() {
        return price;
    }

    // toString() function generated
    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + ID + '\'' +
                ", Symbol='" + Symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {

            //validating price such that it does not receive a negative value
        if(price < 0){
            System.out.println("Only Positive Values accepted");

        }else{

            this.price = price;

        }

    }
}


