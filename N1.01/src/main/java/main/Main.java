package main;

import com.models.GenericMethod;
import com.models.Person;

public class Main {
    static void main(String[] args) {

        Person person = new Person("Maria","Rossi",24);
        GenericMethod.printElements(person,23,"string");

    }
}
