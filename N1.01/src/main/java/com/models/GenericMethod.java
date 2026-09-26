package com.models;

public class GenericMethod {

    public static <T , U, V> void printElements(T t1, U t2, V t3) {
        System.out.println(t1 + "  " + t2 + "  " + t3);
    }
}
