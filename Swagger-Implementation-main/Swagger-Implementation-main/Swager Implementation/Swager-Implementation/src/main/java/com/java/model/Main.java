package com.java.model;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Raj");
        person.setId(1);
        person.setAddress("Texas");

        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's ID: "+ person.getId());
        System.out.println("Person's Address"+ person.getAddress());}
}
