package com.basics.java8;

public interface DefaultAnsStaticMethods {

    public static final String NAME = "TestName";
    public void doSum();

    default String getName(){
        return NAME;
    }

    static String staticMethod() {
        return "Static Content";
    }

}
