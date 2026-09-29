package com.models;

public class VarargMethod {

    @SafeVarargs
    public static <T> void genericVararg(T...t) {
        for (T var : t) {
            System.out.println(var);
        }
    }
}
