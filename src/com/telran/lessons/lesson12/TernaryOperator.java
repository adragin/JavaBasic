package com.telran.lessons.lesson12;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 5 , b = 10;

        int x = minTernary(a, b);

        int y = a > b ? a : b;

    }

    public static int minTernary(int a, int b){
        return a > b ? a : b;
     }
}
