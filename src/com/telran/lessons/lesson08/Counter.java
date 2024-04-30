package com.telran.lessons.lesson08;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

//        Создайте класс Counter, в main методе которого будут выводиться числа от 1 до 10, затем обратно от 10 до 1.
//        Используйте переменную count.
//        Используйте инкремент для первой части и декремент для второй части.

//        int count = 0;
//        System.out.println("Увеличение счётчика");
//        for (int i = 0; i < 10; i++) {
//            count++;
//            System.out.println("count = " + count);
//        }
//        System.out.println("Уменьшение счётчика");
//        for (int i = 0; i < 10; i++) {
//            System.out.println("count = " + count);
//            count--;
//        }

//          Напишите программу, которая запрашивает у пользователя числа до тех пор,
//          пока не будет введено число 0. Подсчитайте, сколько раз было введено каждое из чисел:
//          положительное или отрицательное (используйте инкремент для счетчиков).

        int counterPositiv = 0;
        int counterNegativ = 0;

        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        while (nextInt != 0){
            if (nextInt > 0){
                counterPositiv++;
            } else {
                counterNegativ++;
            }
            nextInt = sc.nextInt();
        }
        System.out.println("Положительных чисел - " + counterPositiv);
        System.out.println("Отрицательных чисел - " + counterNegativ);

    }
}
