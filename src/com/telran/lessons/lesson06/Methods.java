package com.telran.lessons.lesson06;

public class Methods {
    public static void main(String[] args) {

        printSum(5, 10);
        System.out.println(getSum(11, 22));

    }


    //  Создайте метод printSum(int a, int b), который ничего не возвращает,
    //  и печатает результат суммы двух полученных чисел в консоль.

    public static void printSum(int a, int b){
        System.out.println(a + b);
    }

    // Создайте метод getSum(int a, int b), который возвращает результат - сумма двух чисел,
    // а печать в консоль производит вызывающий метод.

    public static int getSum(int a, int b){
        return a + b;
    }
}
