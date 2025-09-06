package com.omarelsheikh.javacourse.angiejones.chapter4;

import java.util.Scanner;

/**
 * Do While loop.
 * Write a program that allows a user to enter two numbers,
 * and then sums up those numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

    public static void main(String[] args) {

        int number1;
        int number2;
        int sum;

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Declare a boolean to control the loop
        boolean again;

        do {
            System.out.println("Enter the first number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            sum = firstNumber + secondNumber;
            System.out.println("Calculating the sum of " + firstNumber + " and " + secondNumber + " = " + sum);

            // Ask the user if they want to perform another addition
            System.out.println("Would you like to start again? (true/false)");
            again = scanner.nextBoolean();

        } while (again);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}