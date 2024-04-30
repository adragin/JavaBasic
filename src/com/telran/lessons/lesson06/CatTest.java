package com.telran.lessons.lesson06;

public class CatTest {
    public static void main(String[] args) {
        Cat bob = new Cat("Bob");

        bob.sayName();

        bob.setName("Bella");

        System.out.println("Now my name is " + bob.getName());
    }
}
