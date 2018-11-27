package com.cl.State;

/**
 * Room is available
 * @author Can Li
 */

public class AvailableState implements State{

    @Override
    public void handle() {
        System.out.println("room is available for book");
    }
}
