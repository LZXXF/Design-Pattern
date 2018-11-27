package com.cl.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> list = new ArrayList<>();

    public void register(Observer observer) {
        list.add(observer);
    }
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    //notify all observers to update
    public void notifyAllObservers() {
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}