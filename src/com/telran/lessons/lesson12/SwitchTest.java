package com.telran.lessons.lesson12;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        int day;
        String dayString;

        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

//        switch (day){
//            case 1:
//                dayString ="Monday";
//                break;
//            case 2:
//                dayString ="Tuesday";
//                break;
//            case 3:
//                dayString ="Wednesday";
//                break;
//            case 4:
//                dayString ="Thursday";
//                break;
//            case 5:
//                dayString ="Friday";
//                break;
//            case 6:
//                dayString ="Saturday";
//                break;
//            case 7:
//                dayString = "Sunday";
//                break;
//            default:
//                dayString = "Ou...Ou...There are only 7 days.";
//        }
//        System.out.println(dayString);

        String value = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> {
                System.out.println("It's A Wednesday");
                yield "Wednesday";
            }
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> {
                System.out.println("Sunday");
                yield "Sunday";
            }
            default -> "Wrong day";
        };
        System.out.println(value);

    }
}
