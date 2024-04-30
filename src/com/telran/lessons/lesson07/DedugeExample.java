package com.telran.lessons.lesson07;

public class DedugeExample {
    public static void main(String[] args) {
//        byte a = 127;
//        byte b = 1;
//        byte c = (byte) (a + b);
//        System.out.println("Result of (127 + 1) as byte: " + c);

//        int[] numbers = {1, 2, 3, 4, 5};
//        for (int i = 0; i < numbers.length; i++) {
//            if (i == 0){
//                System.out.print("[" + numbers[i] + ",");
//            } else if (i == numbers.length - 1){
//                System.out.print(" " + numbers[i] + "]");
//            } else {
//                System.out.print(" " + numbers[i] + ",");
//            }
//        }

        long number = 20;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);

    }
        public static long factorial(long n){
            long res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        }
}
