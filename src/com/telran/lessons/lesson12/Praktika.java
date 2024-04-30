package com.telran.lessons.lesson12;

import java.util.Scanner;

public class Praktika {
    public static void main(String[] args) {

        String dayOfWeek;

        Scanner sc = new Scanner(System.in);

        dayOfWeek = sc.nextLine();

        switch (dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default :
                System.out.println("Wrong day");
        }

        if  (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
             dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")){
            System.out.println("Working day");
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
            System.out.println("Weekend");
        } else {
            System.out.println("Wrong day");
        }
    }
}
