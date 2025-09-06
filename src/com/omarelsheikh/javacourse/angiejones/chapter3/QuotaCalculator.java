package com.omarelsheikh.javacourse.angiejones.chapter3;

import java.util.Scanner;

/**
 * If else
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main(String[] args) {

        // Initialize values we know
        int quota = 10;

        // Get unknown values
        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Validate input
        if (sales < 0) {
            System.out.println("Sales cannot be negative.");
            return; // Exit the program early
        }

        // Make decisions on the path to take - Output
        if (sales >= quota) {
            System.out.println("Congratulations! You've met your quota");
        } else {
            int salesShort = quota - sales;
            System.out.println("You didn't make your quota. You were " + salesShort + " sales short.");
        }
    }
}