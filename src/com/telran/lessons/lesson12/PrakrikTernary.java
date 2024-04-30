package com.telran.lessons.lesson12;

import java.util.Scanner;

public class PrakrikTernary {
    public static void main(String[] args) {

        int dayOfWeek;
        String dayType;
        Scanner sc = new Scanner(System.in);

        dayOfWeek = sc.nextInt();
        switch (dayOfWeek){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Working day";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default :
                dayType = "Wrong day";
        }

        dayType = (dayOfWeek >0 && dayOfWeek <= 5) ?
                "Working day" :
                (dayOfWeek == 6 || dayOfWeek == 7) ?
                        "Weekend" :
                        "Wrong day";

        System.out.println(dayType);
    }
}
