package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adam", "Niezgodka", "p@gmail.com");
        person.displayInfo();
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Chris","Redfield","k@gmail.com"));
        people.add(new Person("Karl","Fitzgerald","l@gmail.com"));
        for(Person p : people)
            p.displayInfo();

    }
}