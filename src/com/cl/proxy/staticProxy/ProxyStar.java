package com.cl.proxy.staticProxy;

public class ProxyStar implements Star{

    private Star realStar;

    public ProxyStar(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void sing() {
        realStar.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }
}
