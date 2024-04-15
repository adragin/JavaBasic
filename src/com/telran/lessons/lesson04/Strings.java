package com.telran.lessons.lesson04;

public class Strings {
    public static void main(String[] args) {

        String str1 = "Hello Java!";

        String a = str1;

        System.out.println("Now:");
        System.out.println("                    str1 =  " + str1);
        System.out.println("                  a=str1 => " + a);
        System.out.println("   Хэш код строки 'str1' =  " + str1.hashCode());
        System.out.println("      Хэш код строки 'a' =  " + a.hashCode());

        str1 = str1 + "###";
        String b = str1;

        System.out.println("Now:");
        System.out.println("     NEW str1 = " + str1);
        System.out.println("  a(old str1) = " + a);
        System.out.println("  b(new str1) = " + b);
        System.out.println("           a = b   ==> " + (a == b));
        System.out.println("        a equals b ==> " + (a.equals(b)));
        System.out.println("   Хэш код строки 'str1' = " + str1.hashCode());
        System.out.println("      Хэш код строки 'a' = " + a.hashCode());
        System.out.println("      Хэш код строки 'b' = " + b.hashCode());

    }
}
