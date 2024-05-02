package com.telran.lessons.lesson14;

import java.util.Scanner;

public class CycleTest {
    public static void main(String[] args) {
        int count = 3;
         while  (count != 0){
             count--;
             System.out.println("Привет программист");
         }
//         ЗАДАНИЕ
//  1. Используйте цикл do-while
//  2. Инициализируйте переменную int i = 0;
//  3. Добавьте в тело инструкцию System.out.println("Я в теле DO");
//  4. Определите условие i < 3
//  5. Запустите код
//  6. Определите условие i < 0
//  7. Проанализируйте результат

        int i = 0;
        do {
            System.out.println("Я в теле DO");
            i++;
        } while (i < 5);

//        Реализуйте меню выбора игрока (Elf or Orc and Exit)
//      a. Отобразите меню
//            i. 1. Elf
//           ii. 2. Orc
//          iii. 3. Exit
//      b. Проверьте ввод на соответствие, в случае неверного ввода распечатайте "Choose any one : " и покажите меню выбора
//      c. Сохраните выбор
//      d. Распечатайте выбор в консоль

        Scanner scan = new Scanner(System.in);
        boolean goodChoice = false;
        System.out.println("Выберите персонажа:");
        do {
            System.out.println("    1. Elf");
            System.out.println("    2. Orc");
            System.out.println("    3. Exit");
            int choice = scan.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Your choice is Elf.");
                    goodChoice = true;
                    break;
                case 2 :
                    System.out.println("Your choice is Orc.");
                    goodChoice = true;
                    break;
                case 3 :
                    System.out.println("You're out.");
                    goodChoice = true;
                    break;
                default:
                    System.out.println("Choose any one : ");
            }
        } while (!goodChoice);

    }
}
