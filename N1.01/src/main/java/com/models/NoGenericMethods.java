package com.models;

public class NoGenericMethods {

    private String value1;
    private String value2;
    private String value3;

    public NoGenericMethods(String value1, String value2, String value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public String getElement1() {
        return value1;
    }

    public String getElement2() {
        return value2;
    }

    public String getElement3() {
        return value3;
    }
}
