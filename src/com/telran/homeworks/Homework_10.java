package com.telran.homeworks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Homework_10 {

//   №1
//  Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//  Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//
//      Например:   ввод - mama, papa
//                  вывод - mapa
//
//   №2
//  Реализовать программу, выводящую на экран результаты:
//      Сложения двух чисел
//      Вычитания двух чисел
//      Умножения двух чисел
//      Деления двух чисел
//  Каждая из арифметических операций должна быть реализована как отдельный метод.

    public static void main(String[] args) {
//        #1
        String str1 = getEvenString();
        String str2 = getEvenString();
        System.out.print("Ваше гибридное слово:  ");
        System.out.println(str1.substring(0, str1.length()/2) + str2.substring(str2.length()/2));

//        #2
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два целых чила:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Результаты арифметических действий с вашими числами:");
        System.out.println("    Сложение  : " + sumOfNums(num1, num2));
        System.out.println("    Вычитание : " + subOfNums(num1, num2));
        System.out.println("    Деление   : " + divOfNums(num1, num2));
        System.out.println("    Умножение : " + multOfNums(num1, num2));
    }

    public static String getEvenString(){
        Scanner scan = new Scanner(System.in);
        String str;
        while (true){
            System.out.print("Введите строку с четным количеством букв: ");
            str = scan.next();
            if (str.length() % 2 != 0){
                System.out.println("Неверный ввод! Повторите попытку!");
            } else {
                break;
            }
        }
        return str;
    }

    public static int sumOfNums(int a, int b){
        return a + b;
    }

    public static int subOfNums(int a, int b){
        return a - b;
    }

    public static int divOfNums(int a, int b){
        return a / b;
    }

    public static int multOfNums(int a, int b){
        return a * b;
    }





}
