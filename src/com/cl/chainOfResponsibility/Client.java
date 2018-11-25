package com.cl.chainOfResponsibility;


public class Client {

    public static void main(String[] args) {
        Leader a = new Director("Apple");
        Leader b = new Manager("Banana");
        Leader c = new GeneralManager("Orange");
        Leader b2 = new ViceGeneralManager("Avocado");


        a.setNextLeader(b);
        b.setNextLeader(b2);
        b2.setNextLeader(c);
        LeaveRequest request = new LeaveRequest("Pear", 15, "travel");
        a.handleRequest(request);
    }
}
