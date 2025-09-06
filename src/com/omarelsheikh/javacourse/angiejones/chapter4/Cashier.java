package com.omarelsheikh.javacourse.angiejones.chapter4;

import java.util.Scanner;

/**
 * For loop.
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {

    public static void main(String[] args) {

        double totalCost = 0.0;

        // Get number of items to scan
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();

        // Validate the number of items
        for (int i = 1; i <= numberOfItems; i++) {

            // Ask the user for the price of each item
            System.out.println("Enter the price of item " + i + ": ");
            double itemPrice = scanner.nextDouble();

            // Calculate the total cost
            totalCost += itemPrice;
        }

        // Display the total cost of the items
        System.out.printf("The total cost of the items is: $%.2f%n", totalCost);

        // CLose the scanner to prevent resource leaks
        scanner.close();
    }
}