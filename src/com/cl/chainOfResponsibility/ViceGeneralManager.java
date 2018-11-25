package com.cl.chainOfResponsibility;

/**
 * Director class
 * @author Can Li
 */

public class ViceGeneralManager extends Leader {

    public ViceGeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 20) {
            System.out.println("employee" + request.getEmpName() + "ask leave for " + request.getLeaveDays());
            System.out.println("Vice general manager " + this.name + " approved");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
