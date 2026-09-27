package com.models;

public class NoGenericMethods {

    public NoGenericMethods(String... string) {
        for (String s : string) {
            System.out.println(s);
        }
    }
}
