package com.telran.lessons.lesson11;

public class lesson11 {
    public static void main(String[] args) {

//        int num = new Scanner(System.in).nextInt();
//        int num = 10;
//
//        if (num == 10){
//            if (num < 15){
//                System.out.println("num is smaller than 15");
//            } else if (num < 12) {
//                System.out.println("num is smaller than 12 too");
//            } else {
//                System.out.println("num is bigger than 12");
//            }
//        }


//      1. Создайте и инициализируйте переменную int = 20
//      2. В блоке if сравните созданную переменную со значением 10 (==).
//         В блоке if добавить инструкцию System.out.println("i is 10")
//      3. Добавьте блок else if и сравните переменную со значением 15 (==),
//         внутри блока добавить инструкцию System.out.println("i is 15");
//      4. Добавите еще один блок else if и сравните переменную со значением 20 (==)
//      5. Добавьте блок else добавьте инструкцию System.out.println("i is not present");
//      6. Проанализируйте вывод

//        int a = 20;
//
//        if (a == 10){
//            System.out.println("a is 10");
//        } else if (a == 15) {
//            System.out.println("a is 20");
//        } else if (a == 20) {
//            System.out.println("a is 20");
//        } else {
//            System.out.println("a is not present");
//        }

//      1. Создайте и инициализируйте переменную boolean t = true;
//      2. Добавьте инструкцию System.out.println("Before the return instruction");
//      3. В блоке if определите оператор return
//      4. Добавьте инструкцию после блока if System.out.println("This won't execute");
//      5. Запустите код
//      6. Проанализируйте вывод используя режим дебаггера
//      7. Переопределите переменную t = false
//      8. Проанализируйте вывод используя режим дебаггера

        boolean t = true;
        System.out.println("Before the return instruction");



    }

    public static boolean ifReturn(boolean boo){
        if (boo){
            return boo;
        }
        System.out.println("This won't execute");
        return boo;
    }
}
