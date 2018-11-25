package com.cl.Iterator;

public class Client {

    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");

        MyIterator iterator = cma.getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.getCurrentObject());
            iterator.next();
        }
    }
}
