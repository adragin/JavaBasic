package com.telran.lessons.lesson05;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Alex", 25);
        Student st2 = new Student(2, "Dmytro");
        Student st3 = new Student(3);
        Student st4 = new Student();

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);

    }
}
