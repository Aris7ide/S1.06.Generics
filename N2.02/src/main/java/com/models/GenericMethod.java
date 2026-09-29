package com.models;

public class GenericMethod {

    public  <T , U> String printElements(T t1, U t2, String string) {
        return t1 + "  " + t2 + "  " + string;
    }
}
