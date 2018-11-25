package com.cl.chainOfResponsibility;

/**
 * Director class
 * @author Can Li
 */

public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("employee" + request.getEmpName() + "ask leave for " + request.getLeaveDays());
            System.out.println("General manager " + this.name + " approved");
        } else {
            System.out.println("request rejected by general manager");
        }
    }
}
