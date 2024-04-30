package com.telran.lessons.lesson13;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        printNumbers(10);
        printNumbers(15);
        printNumbers(-20);

        printEvenNums(10);
        printEvenNums(1);
    }

    public static void printNumbers(int endNum){
        if (endNum <=0) {
            System.out.println("Число должно быть больше нуля.");
        }
        for (int i = 1; i <= endNum; i++) {
            if (i == endNum){
                System.out.printf("%03d", i);
                System.out.println();
            } else {
                System.out.printf("%03d  ", i);
            }
        }
    }
    
    public static void printEvenNums(int endNum){
        if (endNum <= 1) {
            System.out.println("Число должно быть больше единицы.");
        }
        for (int i = 2; i < endNum; i+=2) {
//            System.out.printf("%d  ", i);
            printNumbers(i);
        }
        System.out.println();
    }
}
