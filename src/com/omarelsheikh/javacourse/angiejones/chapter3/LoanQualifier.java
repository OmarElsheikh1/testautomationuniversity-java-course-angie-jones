package com.omarelsheikh.javacourse.angiejones.chapter3;

import java.util.Scanner;

/**
 * Nested id statements.
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String[] args) {

        // Initialize what we know
        int minAnnualSalary = 30000;
        int minYearsAtJob = 2;

        // Get what we don't know
        System.out.println("Please enter your annual salary: ");
        Scanner scanner = new Scanner(System.in);
        double annualSalary = scanner.nextDouble();

        System.out.println("Please enter the number of years you've been at your current job: ");
        int yearsAtJob = scanner.nextInt();

        scanner.close();

        // Validate input
        if (annualSalary <= 0 || yearsAtJob < 0) {
            System.out.println("Invalid input: Salary and years must be positive numbers.");
            return; // Exit program early
        }

        // Make decisions
        if (annualSalary >= minAnnualSalary) {
            if (yearsAtJob >= minYearsAtJob) {
                System.out.println("Congratulations! you qualify for the Loan.");
            } else {
                System.out.println("Sorry, you must have been at your current job for at least " + minYearsAtJob + " years to qualify for the loan.");
            }
        } else {
            System.out.println("Sorry, you must make at least $" + minAnnualSalary + " to qualify for the loan.");
        }
    }
}