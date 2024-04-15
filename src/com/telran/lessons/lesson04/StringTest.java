package com.telran.lessons.lesson04;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        String str = "I like Java!!!";

// Распечатать последний символ строки. Используем метод String.charAt().
// Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
// Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
// Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
// Найти позицию подстроки “Java” в строке “I like Java!!!”.
// Заменить все символы “а” на “о”.
// Преобразуйте строку к верхнему регистру.
// Преобразуйте строку к нижнему регистру.

//        System.out.println(str.charAt(str.length()-1));
//        System.out.println(str.endsWith("!!!"));
//        System.out.println(str.startsWith("I like"));
//        System.out.println(str.contains("Java"));
//        System.out.println(str.indexOf("Java"));
//        System.out.println(str.replace('a', 'o'));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String strNew = str1.substring(0, str1.length()/2) + str2.substring(str2.length()/2);
        System.out.println(strNew);


        str1.

    }
}
