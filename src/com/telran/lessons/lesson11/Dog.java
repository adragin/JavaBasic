package com.telran.lessons.lesson11;

public class Dog {
    private int age;
    private String name;

    public Dog(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean hasName(){
        if (this.name == null || this.name.equals("")){
            return false;
        }
        return true;
    }
}
