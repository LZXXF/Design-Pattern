package com.cl.State;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new AvailableState());
        context.setState(new BookedState());
    }
}
