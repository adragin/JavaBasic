package com.telran.lessons.lesson05;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Alex", 25);
        Student st2 = new Student(2, "Dmytro");
        Student st3 = new Student(3);
        Student st4 = new Student();
        Student st5 = new Student(1, 25, "Alex");

        System.out.println(st1);
        st1.toString();
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st5);

    }
}
