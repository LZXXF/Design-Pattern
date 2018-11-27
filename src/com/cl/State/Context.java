package com.cl.State;

/**
 * To represent the current state of room
 * @author Can Li
 */

public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
        state.handle();
    }
}
