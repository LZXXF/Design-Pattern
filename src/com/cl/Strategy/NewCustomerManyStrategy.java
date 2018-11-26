package com.cl.Strategy;

public class NewCustomerManyStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("10 percent off");
        return standardPrice * 0.9;
    }
}
