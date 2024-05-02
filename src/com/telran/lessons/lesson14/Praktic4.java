package com.telran.lessons.lesson14;

import java.util.Scanner;

public class Praktic4 {
    public static void main(String[] args) {
//
//    Многие натуральные числа можно представить в виде n = 3*A + 5*B, где A и B -- целые неотрицательные числа.
//    Вам требуется по заданному числу определить, можно ли его представить в таком виде,
//    и если это возможно, найти подходящие A и B.
//
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scan.nextInt();
        boolean exist = false;
        for (int a = 0; a <= num / 3; a++) {
            if ((num - 3 * a) % 5 == 0) {
                int b = (num - 3 * a) / 5;
                System.out.printf("Число %d можно представить в виде n = 3*A + 5*B: %d = 3*%d + 5*%d", num, num, a, b);
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.printf("Число %d нельзя представить в виде n = 3*A + 5*B", num);
        }
    }
}