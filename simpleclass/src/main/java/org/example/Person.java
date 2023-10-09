package org.example;

public class Person {
    public String name;
    public String surname;
    public String email;

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    void displayInfo(){
        System.out.println("Person: " + name + ", " + surname + ", " + email);
    }
}
