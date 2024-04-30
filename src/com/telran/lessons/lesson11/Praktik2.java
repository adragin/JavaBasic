package com.telran.lessons.lesson11;

import java.util.Scanner;

public class Praktik2 {

//      написать программу, которая проверяет, является ли
//      введенное пользователем число четным или нечетным,
//      и выводит соответствующее сообщение.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scan.nextInt();

        checkEven(number);
    }

    public static void checkEven(int a){
        if (a % 2 == 0){
            System.out.println("Число четное.");
        }
        System.out.println("Число нечетное.");
    }
}
