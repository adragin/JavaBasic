package com.telran.lessons.lesson13;


//Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его
//цифр (заранее не известно сколько цифр будет в числе).
//Например:
//Ввод = 12345
//Вывод = 1+2+3+4+5 = 15

import com.telran.lessons.MyLib;

import java.util.Scanner;

public class Praktik3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        printSumOfDigits(MyLib.getInt());
        printSumOfDigits2(MyLib.getInt());

    }

    public static void printSumOfDigits(int num){
        int sum = 0;
        for (int i = 0; num/10 != 0; i++) {
            sum += num % 10;
            num /= 10;
            if (num < 10){
                sum += num;
            }
        }
        System.out.println("Сумма чисел: " + sum);
    }

    public static void printSumOfDigits2(int num){
        int sum = 0;
        String strNum = num + "";
        for (int i = 0; i < strNum.length(); i++) {
            sum += strNum.charAt(i) - '0';
        }
        System.out.println("Сумма чисел: " + sum);
    }

}
