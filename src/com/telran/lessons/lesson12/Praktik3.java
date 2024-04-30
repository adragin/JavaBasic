package com.telran.lessons.lesson12;

public class Praktik3 {
    public static void main(String[] args) {
//      Создать программу, выводящую на экран случайно сгенерированное
//      трёхзначное натуральное число и его наибольшую цифру.
//          Например: 398
//          Выход: 9

        int min = 100;
        int max = 999;

        int rnd = (int) (Math.random() * (max - min + 1) - min);

//        for (int i = 0; i < 100; i++) {
//            System.out.println((int) (Math.random() * (max - min + 1) + min));
//        }

        int rndUnit = rnd % 10;
        int rndDec = rnd / 10 % 10;
        int rndHun = rnd / 100;

        int maxDigit = rndHun > rndDec ?
                rndHun > rndUnit ? rndHun : rndUnit :
                rndDec > rndUnit ? rndDec : rndUnit;

        System.out.println("В числе " + rnd + " максимальное число - " + maxDigit);

    }
}
