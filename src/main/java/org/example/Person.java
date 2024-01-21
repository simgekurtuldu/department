package org.example;

public abstract class Person {
    private String name;
    private String surname;
    private String dateOfBirth;

    public Person(String name, String surname, String dateOfBirth){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }
    public abstract int calculateRetirementAge(); // soyut metod
}