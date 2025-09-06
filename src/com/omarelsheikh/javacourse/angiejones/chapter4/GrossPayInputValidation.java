package com.omarelsheikh.javacourse.angiejones.chapter4;

import java.util.Scanner;

/**
 * While loop.
 * Each store employee makes $15 per hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {

    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;

        // Get input for unknown values
        System.out.println("How many hours did yoi work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate input
        while (hoursWorked > maxHours || hoursWorked < 0) {
            System.out.println("You cannot work more than " + maxHours + " hours per week. Try Again.");
            hoursWorked = scanner.nextDouble();
        }

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Calculate gross pay
        double grossPay = hoursWorked * rate;
        System.out.println("Your gross pay for the week is $" + grossPay + ".");
    }
}