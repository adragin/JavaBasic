package com.telran.lessons.lesson02;

/***
 *              Это просто лекция 2 по Java Basic
 * */

public class Test {
    public static void main(String[] args) {

//        Создать класс Test.
//        Создать метод main.
//        Создать все переменные примитивных и не примитивных типов.
//        Присвоить значения переменным.
//        Распечатать результат в консоль.

        byte b = 120;
        short s = 900;
        int i = 2_147_000_000;

        System.out.println(b + " " + s + " " + i);

//          Дано: два целочисленных числа: 168 и 1500.
//          Примените все математические операторы, результат операций вывести в консоль.
//          Проанализировать результат.

        int x = 168;
        int y = 1500;

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("y % x = " + (y % x));
        System.out.println("x / y = " + (x / y));
        System.out.println("(double)x / y = " + ((double)x / y));


    }
}
