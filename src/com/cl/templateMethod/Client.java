package com.cl.templateMethod;

public class Client {
    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMoney();

        btm.process();

        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("deposit money");
            }
        };

        btm2.process();
    }
}

class DrawMoney extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("withdraw money");
    }
}
