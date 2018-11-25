package com.cl.chainOfResponsibility;

/**
 * Abstract leader class
 * @author Can Li
 */

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * handle request
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}
