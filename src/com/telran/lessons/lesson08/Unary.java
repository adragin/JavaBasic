package com.telran.lessons.lesson08;

public class Unary {
    public static void main(String[] args) {
        int x = 7;

        System.out.println("x = " + x);
        x = -x;
        System.out.println("x = " + x);

        int a = 2;
        int b = a++ + (--a * ++a);
        System.out.println(b);
    }
}
