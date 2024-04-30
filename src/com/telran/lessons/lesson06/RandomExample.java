package com.telran.lessons.lesson06;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random random = new Random();
        int upperBound = 16;
        int lowerBound = 5;
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(upperBound));

        double randomDouble = random.nextDouble(); // от 0.0 включительно до 1.0 НЕ включительно
        System.out.println(randomDouble);


        Random random1 = new Random();
        Random random2 = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNUM = random1.nextInt(upperBound);
            System.out.print(randomNUM + " ");
        }
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            int randomNUM = random2.nextInt(upperBound);
            System.out.print(randomNUM + " ");
        }
        System.out.println("");

        System.out.print("Dice     : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(dice() + " ");
        }
        System.out.println("");

        System.out.print("DiceMath : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(diceMath() + " ");
        }
        System.out.println("");

        printWeatherForecast();
    }

    public static int dice(){
        Random random = new Random();
        return random.nextInt(1, 7);
    }

    public static int diceMath(){
        int min = 1;
        int max = 6;
        return (int)(Math.random() * (max - min + 1 ) + min);
    }

    // При помощи Math.random() сгенерировать 3 числа --
    // прогноз температуры на сегодня, завтра и послезавтра
    // и вывести на экран. температура может быть от -20 до +30 градусов.

    public static int generateTemperature() {
        int minTemp = -20, maxTemp = 31;
        return (int) (Math.random() * (maxTemp - minTemp + 1) + minTemp);
    }

    public static int generateTemperature(int minTemp, int maxTemp){
        return  (int)(Math.random() * (maxTemp - minTemp + 1 ) + minTemp);
    }

    public static void printWeatherForecast() {
        System.out.println("Сегодня: " + generateTemperature());
        System.out.println("Завтра: " + generateTemperature(-20, 31));
        System.out.println("Послезавтра: " + generateTemperature());
    }


}
