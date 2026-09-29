package com.main;

import com.models.GenericMethod;
import com.models.Person;
import com.models.VarargMethod;

public class Main {
    static void main(String[] args) {

        Person person = new Person("Rosa" , "maiello" , 45);

        GenericMethod.printElements(person,34,"String");

        VarargMethod.genericVararg("string",23,23,45,34.45685,person);
    }
}