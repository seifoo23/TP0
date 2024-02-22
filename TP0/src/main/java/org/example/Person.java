package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public boolean isAdult() {
        return age >= 18;
    }

    public static void main(String[] args) {
        Person p1=new Person("seif","eddine",22);
        System.out.println(p1.getFullName());
    }
}
