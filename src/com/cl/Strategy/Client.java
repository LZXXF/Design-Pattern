package com.cl.Strategy;


import com.cl.Iterator.ConcreteMyAggregate;

public class Client {

    public static void main(String[] args) {
        Strategy strategy = new OldCustomerFewStrategy();
        Context context = new Context(strategy);
        context.printPrice(998);
    }
}
