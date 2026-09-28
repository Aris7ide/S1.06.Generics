package com.main;

import com.models.GenericMethod;
import com.models.Person;

public class Main {
    static void main(String[] args) {
        Person person = new Person("Mario","Rossi",32);

        GenericMethod.printElements(person,"Strillo",34.56);
    }
}
