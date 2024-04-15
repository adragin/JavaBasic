package com.telran.lessons.lesson03;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {

// Создать объект Scanner
// Получить от пользователя первое число
// Получить от пользователя второе число
// Произвести математические операции +, -, *, /
// Вывести результат в консоль

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Введите число x: ");
//        int x = sc.nextInt();
//        System.out.println("Введите число y: ");
//        int y = sc.nextInt();
//
//        int result =  5 * x + 10 * y;
//
//        System.out.println("5x + 10y = " + result);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности:");
        double r = sc.nextDouble();

        double areaOfCircle = Math.PI * r * r;
        double circiutOfCircle = 2 * Math.PI * r;

        System.out.println("Площадь окружности: " + areaOfCircle);
        System.out.println("Длина окружности: " + circiutOfCircle);

    }
}
