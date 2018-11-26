package com.cl.Strategy;

public class NewCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("no discount");
        return standardPrice;
    }
}
