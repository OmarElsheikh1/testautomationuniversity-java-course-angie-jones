package com.omarelsheikh.javacourse.angiejones.chapter3;

import java.util.Scanner;

/**
 * Coin Game: The objective is to enter coins that total exactly $1.
 * The user is prompted to input the quantity of pennies, nickels, dimes, and quarters.
 * The program calculates the total value and displays:
 * - A winning message if the total is exactly $1.
 * - A message if the total is more than $1, showing the amount over.
 * - A message if the total is less than $1, showing the amount under.
 * <p>
 * Example:
 * Input: pennies = 50, nickels = 0, dimes = 0, quarters = 0
 * Output: "You were under by $0.50"
 * <p>
 * This program assumes U.S. currency values:
 * Penny = $0.01, Nickel = $0.05, Dime = $0.10, Quarter = $0.25
 */
public class CoinGameLogicalOperator {

    public static void main(String[] args) {

        // Currencies value to dollar
        final double PENNY_VALUE = 0.01;
        final double NICKEL_VALUE = 0.05;
        final double DIME_VALUE = 0.10;
        final double QUARTER_VALUE = 0.25;
        final int DOLLAR_VALUE = 1;

        // Explaining the game objective
        System.out.println("Coin Game: The objective is to enter coins that total exactly $1 :D");

        // Create a scanner to read the user input
        Scanner scanner = new Scanner(System.in);

        // Get the number of coins from the user
        System.out.println("Please enter the number of pennies: ");
        int penny = scanner.nextInt();

        System.out.println("Please enter the number of nickels: ");
        int nickel = scanner.nextInt();

        System.out.println("Please enter the number of dimes: ");
        int dime = scanner.nextInt();

        System.out.println("Please enter the number of quarters: ");
        int quarter = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate the total value of the coins
        double totalValue = (penny * PENNY_VALUE) + (nickel * NICKEL_VALUE) + (dime * DIME_VALUE) + (quarter * QUARTER_VALUE);
        System.out.printf("Total value of the coins: $%.2f%n", totalValue);

        // Check if the total value is equal to, more than, or less than $1
        if (totalValue == DOLLAR_VALUE) {
            System.out.println("You win! You entered exactly $1.00!");
        } else if (totalValue > DOLLAR_VALUE) {
            double overAmount = totalValue - DOLLAR_VALUE;
            System.out.printf("You were over by $%.2f%n", overAmount);
        } else {
            double underAmount = DOLLAR_VALUE - totalValue;
            System.out.printf("You were under by $%.2f%n", underAmount);
        }
    }
}