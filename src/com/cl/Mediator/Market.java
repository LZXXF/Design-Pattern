package com.cl.Mediator;

public class Market implements Department {

    private Mediator m;

    public Market(Mediator m) {
        this.m = m;
        m.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("communicate with other departments");
    }

    @Override
    public void outAction() {
        System.out.println("report projects progress and ask for funds support");
        m.command("financial");
    }
}
