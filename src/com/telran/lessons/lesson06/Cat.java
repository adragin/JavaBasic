package com.telran.lessons.lesson06;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayName(){
        System.out.println("My name is " + name);
    }
}
