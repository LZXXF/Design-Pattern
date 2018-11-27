package com.cl.State;

public class CheckInState implements State {

    @Override
    public void handle() {
        System.out.println("Has checked in");
    }
}
