package com.cl.chainOfResponsibility;

/**
 * Manager class
 * @author Can Li
 */

public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 10) {
            System.out.println("employee" + request.getEmpName() + "ask leave for " + request.getLeaveDays() );
            System.out.println("manger " + this.name + " approved");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
