package com.telran.lessons.lesson13;

//Напишите программу, которая принимает команды управления
//персонажем в текстовой игре (up, down, right, left).
//Используйте switch-case для обработки команд и
//изменения положения персонажа на карте или вывода сообщений о действиях персонажа.
//На команду loc должны выводиться текущие координаты.
//Изначально начинаем в точке с координатами 0,0


import java.util.Scanner;

public class Praktik4 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            String commmand = sc.next();
            switch (commmand){
                case "left":
                    x--;
                    System.out.println("I move left");
                    break;
                case "right":
                    x++;
                    System.out.println("I move right");
                    break;
                case "up":
                    y++;
                    System.out.println("I move up");
                    break;
                case "down":
                    y--;
                    System.out.println("I move down");
                    break;
                case "loc":
                    System.out.println("Mu position is " + x + ", " + y);
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Wrong command");
                    break;
            }
        }
    }
}
