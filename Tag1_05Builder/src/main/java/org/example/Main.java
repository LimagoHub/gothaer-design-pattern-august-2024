package org.example;

import pojo.Person;

public class Main {
    public static void main(String[] args) {

        Person p = Person.builder().id("4711").build();

        System.out.println(p);

        //Complex c = new Complex(1.4, 5.6);

        System.out.println("Hello world!");
    }
}