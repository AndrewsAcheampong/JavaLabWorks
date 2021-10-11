package com.JavaProject;

public class Stock extends Product{
    private String exchange;
    private String ticker;
    private ProductPricingService productPricingService;

    public Stock(String id, String ticker, ProductPricingService productPricingService){
        super(id);
        this.ticker = ticker;
        this.productPricingService = productPricingService;
    }


    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }



    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }



    @Override
    public double getPrice() {
        return 0; //todo: implement this correctly
    }




}
