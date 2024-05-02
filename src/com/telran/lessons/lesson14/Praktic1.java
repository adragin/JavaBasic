package com.telran.lessons.lesson14;

import java.util.Scanner;

public class Praktic1 {
    public static void main(String[] args) {

//        написать программу, считывающую 2 числа и выводящую их сумму
//        если два числа равны между собой, вывести одно число и остановить программу.

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a  = scan.nextInt();
        System.out.print("Введите второе число: ");
        int b  = scan.nextInt();
        while (a != b){
            System.out.println("Сумма чисел равна " + (a + b));
            a  = scan.nextInt();
            b = scan.nextInt();
        }
        System.out.println("Числа равны : " + a);

    }


//    public static int readNummers(){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int a  = scan.nextInt();
//        System.out.print("Введите второе число: ");
//        int b  = scan.nextInt();
//        return a, b;
//    }
}
