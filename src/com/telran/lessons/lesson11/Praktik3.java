package com.telran.lessons.lesson11;

public class Praktik3 {
    public static void main(String[] args) {

//      написать метод isAllowed, принимающий на вход рост посетителя аттракциона
//      и возвращающий true, если ему можно пройти (рост больше 140) или
//      false, если нельзя

        canGo(120);
        canGo(140);
        canGo(160);

    }

    public static boolean canGo(int height){
        return height >= 140;
    }

    public static int minOfThree(int a, int b, int c){
        if (a <= b && a <= c){
            return a;
        }
        if (b <= a && b <= c){
            return b;
        }
        if (c <= a && c <= b){
            return c;
        }
        return a;
    }
}
