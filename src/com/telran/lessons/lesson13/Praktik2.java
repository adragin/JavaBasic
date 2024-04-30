package com.telran.lessons.lesson13;

import java.util.Scanner;

//Получите от пользователя Строку.
//2. Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
//3. Для решения используйте цикл и charAt() метод
//Например:
//Вход = “I don’t like rain !”
//выход = I,d,o,n,t,l,i,k,e,r,a,i,n

public class Praktik2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printStr(str);
    }

    public static void printStr(String word){
        word = word.replace('!', ' ');
        word = word.replace('?', ' ');
        word = word.replace(',', ' ');
        word = word.replace('.', ' ');
        word = word.replace('’', ' ');
        word = word.trim();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' '){
                continue;
            }
            System.out.print(word.charAt(i));
            if (i != word.length() - 1){
                System.out.print(",");
            }
        }
    }


}
