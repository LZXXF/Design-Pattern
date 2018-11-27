package com.cl.observer;

public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer obs1 = new ConcreteObserver();
        Observer obs2 = new ConcreteObserver();
        Observer obs3 = new ConcreteObserver();

        subject.register(obs1);
        subject.register(obs2);
        subject.register(obs3);

        subject.setState(30);

        System.out.println(((ConcreteObserver) obs1).getState());
        System.out.println(((ConcreteObserver) obs2).getState());
        System.out.println(((ConcreteObserver) obs3).getState());

    }
}
