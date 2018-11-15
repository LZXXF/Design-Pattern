package com.cl.singleton;

/**
 * Single design pattern implementation with static inner class
 * @author Can Li
 */

public class SingletonDemo3 {

    private static class SingletonClassInstance {
        private static final SingletonDemo3 instance = new SingletonDemo3();
    }

    private SingletonDemo3() {

    }

    public static SingletonDemo3 getInstance() {
        return SingletonClassInstance.instance;
    }
}
