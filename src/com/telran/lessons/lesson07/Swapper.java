package com.telran.lessons.lesson07;

public class Swapper {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        System.out.println(a + ", " + b);
        swap(a, b);
        System.out.println(a + ", " + b);

        int[] nums = new int[]{2, 5};
        System.out.println(nums[0] + ", " + nums[1]);
        swap(nums[0], nums[1]);
        System.out.println(nums[0] + ", " + nums[1]);


    }

    public static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + ", " + b);
    }



}
