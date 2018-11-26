package com.cl.Mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator {

    private Map<String, Department> map = new HashMap<>();

    @Override
    public void register(String department, Department d) {
        map.put(department, d);
    }

    @Override
    public void command(String department) {
        map.get(department).selfAction();
    }
}
