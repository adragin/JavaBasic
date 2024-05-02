package com.telran.lessons.lesson14;

import java.util.Scanner;

public class Praktik3 {
    public static void main(String[] args) {
// 1) Подсчитайте, сколько среди данных n чисел нулей, положительных чисел и отрицательных чисел.

        System.out.print("Введите количество чисел: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int qtyPos = 0;
        int qtyNeg = 0;
        int qtyZero = 0;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num > 0){
                qtyPos++;
            } else if(num < 0){
                qtyNeg++;
            } else {
                qtyZero++;
            }
        }
        System.out.printf("Количество положительных - %d, количество отрицательных - %d, количество нулей -%d", qtyPos, qtyNeg, qtyZero);


    }
}
