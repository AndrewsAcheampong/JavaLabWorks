package com.JavaProject;

public interface ProductPricingService {
    double price(String exchange, String ticker);//interface for stocks

    double price(String exchange , String countryCode, int month, int year);//interface for Future
}
