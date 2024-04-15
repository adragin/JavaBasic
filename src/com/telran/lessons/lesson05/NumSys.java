package com.telran.lessons.lesson05;

public class NumSys {
    //Переведите число 333 из 16-ричной в 10-ричную
    //Переведите число 819 из 10-ричной в 16-ричную
    //101101 в двоичной, переведите в 10-ричную
    //124 в десятичной, переведите в 2-ичную

    public static void main(String[] args) {

        String hexNum = "333";  // 16-ричная строка
        int decNum = 0;         // Переменная для хранения 10-ричного числа
        for (int i = hexNum.length()-1; i >=0 ; i--) {
            int digit = hexNum.charAt(i);
            digit = Character.digit(digit, 16);
            decNum = decNum + (int) (digit * Math.pow(16, i));
        }
        System.out.println("Число " + hexNum + " в 16-ричной системе = " + decNum + " в 10-ричной системе");

        int decNumber = 819; // Число в 10-ричной системе
        String hexString = Integer.toHexString(decNumber); // Преобразуем в 16-ричную строку
        System.out.println("Число " + decNumber + " в 10-ричной системе = " + hexString + " в 16-ричной системе");

        String binaryString = "101101"; // Двоичная строка
        int decimalNumber = 0; // Переменная для хранения 10-ричного числа
        // Преобразуем каждый символ двоичной строки в число
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            int digit = binaryString.charAt(i) - '0'; // Получаем цифру
            decimalNumber += digit * (int) Math.pow(2, i); // Добавляем к 10-ричному числу с учётом степени 2
        }
        System.out.println("Число " + binaryString + " в двоичной системе = " + decimalNumber + " в 10-ричной системе");

        //124 в десятичной, переведите в 2-ичную
        int startNum = 124;
        StringBuilder binarNum = new StringBuilder();
        int decimNum = startNum;
        while(decimNum > 0) {
            int newBinChar = (decimNum % 2);
            decimNum = decimNum / 2;
            binarNum.append(newBinChar);
        }
        System.out.println("Число " + startNum + " в 10-ричной системе = " + binarNum.reverse() + " в двоичной системе");

    }

}
