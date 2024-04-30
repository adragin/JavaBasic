package com.telran.lessons.lesson11;

import java.util.Scanner;

public class Praktik1 {

//      написать программу, которая считывает два целых
//      числа с клавиатуры и выводит на экран сообщение
//      о том, какое из чисел больше, или сообщает, что они равны.
//      "первое число больше"
//      "второе число больше"
//      "числа равны"

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        compareNumbers(number1, number2);
    }

    public static void compareNumbers(int a, int b){
        if (a > b){
            System.out.println("первое число больше");
        } else if (a < b){
            System.out.println("второе число больше");
        }
        System.out.println("числа равны");
    }
}
