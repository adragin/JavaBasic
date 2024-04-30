package com.telran.lessons.lesson07;

// Напишите класс Converter для конвертации из градусов по Цельсию в
// Кельвины , Фаренгейты:
// У класса должны быть методы для конвертации.
// Реализуйте два метода в классе:
// runKelvinConverter(double baseValue)
// runFahrenheitConverter(double baseValue)

public class Coverter {
    public static void main(String[] args) {
        System.out.println(runCelsiusToFahrenheitConverter(15));
        System.out.println(runCelsiusToKelvinConverter(15));


    }

    public static double runCelsiusToKelvinConverter(double baseValue){
        return baseValue + 273.15;
    }

    public static double runCelsiusToFahrenheitConverter(double baseValue){
        return baseValue * 1.8 + 32;
    }
}
