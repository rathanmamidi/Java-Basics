package com.basics.abstraction;

public abstract class ORGEmployee implements Employee {

    public ORGEmployee() {
        System.out.println("Abstract Class constructor");
    }

    @Override
    public String fetchName() {
        return "Pari";
    }

    @Override
    public Integer fetchId() {
        return 1234;
    }

    @Override
    public String fetchDepartment() {
        return "java";
    }
}
