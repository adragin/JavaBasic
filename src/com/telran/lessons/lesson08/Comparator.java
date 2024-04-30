package com.telran.lessons.lesson08;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b){
            if (a > c){
                System.out.println("a=" + a + " is the biggest nummer");
            } else {
                System.out.println("c=" + c + " is the biggest nummer");
            }
        } else {
            if (b > c){
                System.out.println("b=" + b + " is the biggest nummer");
            } else {
                System.out.println("c=" + c + " is the biggest nummer");
            }
        }

        sc.close();
    }
}
