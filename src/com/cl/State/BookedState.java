package com.cl.State;

/**
 * room has been booked
 * @author Can Li
 */

public class BookedState implements State {

    @Override
    public void handle() {
        System.out.println("room has been booked");
    }
}
