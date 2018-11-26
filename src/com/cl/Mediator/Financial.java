package com.cl.Mediator;

public class Financial implements Department {

    private Mediator m;

    public Financial(Mediator m) {
        this.m = m;
        m.register("financial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("manage budget");
    }

    @Override
    public void outAction() {
        System.out.println("provide budget reports");
    }
}
