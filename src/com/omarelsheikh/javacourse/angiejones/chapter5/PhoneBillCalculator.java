package com.omarelsheikh.javacourse.angiejones.chapter5;

import java.util.Scanner;

/**
 * A simple program to calculate a phone bill.
 * It takes the base plan cost and the number of overage minutes as input,
 * then calculates:
 * - Overage fee ($0.25 per minute)
 * - Tax (15% of subtotal)
 * - Final total
 * Finally, it prints an itemized bill.
 */
public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);
    static double overageFeePerMinute = 0.25;
    static double taxRate = 0.15;

    public static void main(String[] args) {

        // Enter base plan cost
        System.out.println("Enter base cost of the plan: ");
        double basePlanCost = scanner.nextDouble();
        // Enter overage minutes
        System.out.println("Enter overage minutes: ");
        int overageMinutes = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate the bill
        double overageFee = calculateOverageFee(overageMinutes);
        double subtotal = basePlanCost + overageFee;
        double tax = calculateTax(subtotal);
        double total = subtotal + tax;

        // Print the itemized bill
        System.out.println("Phone Bill Statement");
        System.out.printf("Plan: $%.2f%n", basePlanCost);
        System.out.printf("Overage: $%.2f%n", overageFee);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);
    }

    // Method to calculate overage fee
    public static double calculateOverageFee(int overageMinutes) {
        return overageMinutes * overageFeePerMinute;
    }

    // Method to calculate tax
    public static double calculateTax(double subtotal) {
        return subtotal * taxRate;
    }
}