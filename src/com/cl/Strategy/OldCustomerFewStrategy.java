package com.cl.Strategy;

public class OldCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("15 percent off");
        return standardPrice * 0.85;
    }
}
