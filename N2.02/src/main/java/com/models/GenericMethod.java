package com.models;

public class GenericMethod {

    public static <T , U> void printElements(T t1, U t2, String string) {
        System.out.println(t1 + "  " + t2 + "  " + string);
    }
}
