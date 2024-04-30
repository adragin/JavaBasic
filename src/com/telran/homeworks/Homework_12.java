package com.telran.homeworks;

import java.util.Scanner;

public class Homework_12 {
    public static void main(String[] args) {
//  1. Создайте две переенные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//   a. Реализует логический метод canBuy, возвращающий boolean
//   b. Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//   c. Отобразите строку «Я могу купить еду, это ……» и значение.

        boolean isEdekaOpen = false;
        boolean isReweOpen = false;
        System.out.println("Я могу купить еду , это " + (isEdekaOpen || isReweOpen?"правда":"неправда"));

//  Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет.
//  Високосным является год, номер которого кратен четырём, но не кратен 100. При этом годы, кратные четырем, также високосные.
//  Отсюда следует распределение високосных годов: год, номер которого кратен 400, — високосный;
//   остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
//   остальные годы, номер которых кратен 4, — високосные; все остальные годы — невисокосные.

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год : ");
        int year = scan.nextInt();
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0;
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

//  Реализуйте программу, которая попросит пользователя ввести три целых
//  числа (используйте сканер) и напечатает максимум из трех чисел.

        System.out.println("Введите три целых чила:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int maxNum = num1 > num2 ?
                num1 > num3 ? num1 : num3 :
                num2 > num3 ? num2 : num3;
        System.out.print("Максимальное число из введеных - " + maxNum);
    }
}
