package com.JavaProject;

public class Future extends Product{
    private String exchange, contractCode;
    private int month, year;
    private ProductPricingService productPricingService;


    public Future(String id, String exchange, String contractCode, int month, int year, ProductPricingService productPricingService) {
        super(id,exchange);
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
        this.productPricingService = productPricingService;
    }

    @Override
    public double getPrice() {

        return 0;
    }
}
