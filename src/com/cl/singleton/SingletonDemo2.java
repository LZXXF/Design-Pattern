package com.cl.singleton;

/**
 * Lazy load
 * @author Can Li
 */

public class SingletonDemo2 {

    private static SingletonDemo2 instance;

    private SingletonDemo2() {

    }

    //Singleton instance will not be created while Singleton class is initialized. Lazy load
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
