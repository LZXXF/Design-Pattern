package com.cl.chainOfResponsibility;

/**
 * Director class
 * @author Can Li
 */

public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println("employee" + request.getEmpName() + "ask leave for " + request.getLeaveDays());
            System.out.println("Director " + this.name + " approved");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
