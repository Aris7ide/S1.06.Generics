package com.models;

public class Vararg {

    @SafeVarargs
    public static <T> void genericVararg(T...t) {
        for (T var : t) {
            System.out.println(var);
        }
    }
}
