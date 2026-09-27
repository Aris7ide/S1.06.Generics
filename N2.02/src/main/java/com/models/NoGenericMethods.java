package com.models;

public class NoGenericMethods {

    public NoGenericMethods(String... string) {
        for (String s : string) {
            System.out.println(s);
        }
    }

    public static <T> void genericVararg(T...t) {
        for (T var : t) {
            System.out.println(var);
        }

    }
}
