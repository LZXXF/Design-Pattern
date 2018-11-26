package com.cl.Mediator;

/**
 * Mediator interface
 * @author Can Li
 */

public interface Mediator {

    void register(String department, Department d);

    void command(String department);
}
