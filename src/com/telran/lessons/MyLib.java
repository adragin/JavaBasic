package com.telran.lessons;

import java.util.Scanner;

public class MyLib {
    public static void main(String[] args) {

    }

    public static int getInt(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        return scan.nextInt();
    }

    public static double getDouble(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число с плавающей точкой: ");
        return scan.nextDouble();
    }

    public static String getString(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        return scan.next();
    }
}
