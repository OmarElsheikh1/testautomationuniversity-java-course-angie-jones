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
    static double planBaseCost;
    static double overageFeePerMinute = 0.25;
    static double taxRate = 0.15;

    public static void main(String[] args) {

        System.out.println("Enter base cost of the plan: ");
        planBaseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes: ");
        int overageMinutes = scanner.nextInt();

        scanner.close();

        double overageFee = calculateOverageFee(overageMinutes);
        double subtotal = planBaseCost + overageFee;
        double tax = calculateTax(subtotal);
        double total = subtotal + tax;

        System.out.println("Phone Bill Statement");
        System.out.printf("Plan: $%.2f%n", planBaseCost);
        System.out.printf("Overage: $%.2f%n", overageFee);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);
    }

    public static double calculateOverageFee(int overageMinutes) {
        return overageMinutes * overageFeePerMinute;
    }

    public static double calculateTax(double subtotal) {
        return subtotal * taxRate;
    }
}