package com.telran.lessons.lesson14;

import java.util.Scanner;

public class Praktic2 {
    public static void main(String[] args) {
// По данному натуральному n вычислите сумму 1^2 + 2^2 + ... + n^2

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("Сумма 1^2 + 2^2 + ... + " + n + "^2 = " + sum);

//Напишите программу, которая будет печатать коробку из #, принимая от пользователя
//значения высоты и ширины.
//Например:
//Вход = 3, 3
//Выход =
//###
//###
//###
        System.out.print("Введите х: ");
        int x = scan.nextInt();
        System.out.print("Введите y: ");
        int y = scan.nextInt();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

//По данному натуральному n вычислите сумму 2^1 + 2^2 + ... + 2^n

        int pow = scan.nextInt();
        int sum2 = 0;
        for (int i = 1; i <= pow; i++) {
            int next = 1;
            for (int j = 1; j <= i; j++) {
                next *= 2;
            }
            sum2 += next;
        }
        System.out.println(sum2);

    }
}
