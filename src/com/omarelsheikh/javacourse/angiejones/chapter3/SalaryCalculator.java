package com.omarelsheikh.javacourse.angiejones.chapter3;

import java.util.Scanner;

/**
 * If statement.
 * All sales people get a payment of $1000 a week.
 * Sales people who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {

    public static void main(String[] args) {

        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get values for the unknown
        System.out.println("Please enter the number of sales made by the employee: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfSales = scanner.nextInt();
        scanner.close();

        // Quick detour for the bonus earners
        if (numberOfSales > quota) {
            salary += bonus;
            System.out.println("Bonus awarded!");
        } else {
            System.out.println("No bonus awarded.");
        }

        // Output
        System.out.println("The employee's pay is: $" + salary);
    }
}