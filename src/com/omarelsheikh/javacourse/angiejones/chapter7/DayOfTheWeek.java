package com.omarelsheikh.javacourse.angiejones.chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//
//        for (int i = 0; i < days.length; i++) {
//            System.out.println("Enter a Day from 1 to 7: ");
//            int day = scanner.nextInt();
//            if (day >= 1 && day <= 7) {
//                System.out.println("The day is: " + days[day - 1]);
//                break;
//            } else {
//                System.out.println("Invalid input, please try again.");
//            }
//        }
//        while (true) {
//            System.out.println("Enter a number from 1 to 7:");
//            int day = scanner.nextInt();
//
//            if (day >= 1 && day <= 7) {
//                System.out.println("The day is: " + days[day - 1]);
//                break; // stop once valid
//            } else {
//                System.out.println("Invalid input, try again.");
//            }
//        }

        boolean valid = false;
        while (!valid) {
            System.out.print("Enter a day number from 1 to 7: ");
            int day = scanner.nextInt();

            if (day >= 1 && day <= 7) {
                System.out.println("The day is: " + days[day - 1]);
                valid = true;
            } else {
                System.out.println("Invalid input, please try again.");
            }
        }

    }
}