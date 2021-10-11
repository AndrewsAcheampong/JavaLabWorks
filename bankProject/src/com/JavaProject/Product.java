package com.JavaProject;

public abstract class Product {

    private String id,exchange;

    public Product(String id, String exchange){
        this.id = id;
        this.exchange = exchange;

    }

    public Product(String id) {
    }

    //abstract methods do not have a body because it's not implemented.
    public abstract double getPrice();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



}
