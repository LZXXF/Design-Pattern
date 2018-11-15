package com.cl.singleton;

/**
 * Singleton pattern: Instance is created while class is initialized
 * @author Can Li
 */

public class SingletonDemo1 {

    //Tread safe
    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1() {

    }

    public static SingletonDemo1 getInstance() {
        return instance;
    }
}
