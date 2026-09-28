package com.main;

import com.models.GenericMethod;
import com.models.NoGenericMethods;
import com.models.Person;
import com.models.Vararg;

public class Main {
    static void main(String[] args) {

        Person person = new Person("Rosa" , "maiello" , 45);
        GenericMethod.printElements(person,34,"String");

        Vararg.genericVararg("string",23,23,45,34.45685,person);
    }
}