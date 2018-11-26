package com.cl.templateMethod;

public abstract class BankTemplateMethod {

    public void takeNumber() {
        System.out.println("take a nubmer");
    }

    public abstract void transact();

    public void evaluate() {
        System.out.println("provide feedback");
    }

    public final void process() {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
