package com.cl.Strategy;

/**
 * context class: responsible for specific strategy
 */

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s) {
        System.out.println("your price is: " + strategy.getPrice(s));
    }
}
