package com.main;

import com.models.GenericMethod;
import com.models.NoGenericMethods;
import com.models.Person;

public class Main {
    static void main(String[] args) {

        NoGenericMethods ngm = new NoGenericMethods("1","2","3");

        Person person = new Person("Rosa" , "maiello" , 45);

        GenericMethod.printElements(person,34,"String");

    }
}