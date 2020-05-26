package com.sda.examples;

public class Person {
    private String authorFirstName;
    private String authorLastName;

    public Person(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Imię autora: " + authorFirstName + '\'' +
                ", Nazwisko autora: " + authorLastName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person =new Person("Jan","Puchacki");
        System.out.println(person.toString());
    }
}


