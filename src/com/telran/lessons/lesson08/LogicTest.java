package com.telran.lessons.lesson08;

// Используя блок if (выражение) {}, составьте логические выражения
//a. истина , если “а” меньше “b” И “b” равно “c”;
//b. истина , если “а” больше “b” ИЛИ “c” равно “d”;
//c. истина , если “а” НЕ равно “b”;


public class LogicTest {
    public static void main(String[] args) {
        int a=5, b=10 , c=10 ,d=10;
        System.out.println((a < b) && (b == c));
        System.out.println((a > b) || (c == d));
        System.out.println((a != b));
    }
}
