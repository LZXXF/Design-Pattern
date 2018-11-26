package com.cl.Mediator;

public class Development implements Department {

    private Mediator m;

    public Development(Mediator m) {
        this.m = m;
        m.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("focus on research and projects development");
    }

    @Override
    public void outAction() {
        System.out.println("responsible for reporting and ask for funds supports");
    }
}
