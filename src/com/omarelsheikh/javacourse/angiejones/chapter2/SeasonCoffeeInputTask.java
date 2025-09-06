package com.omarelsheikh.javacourse.angiejones.chapter2;

import java.util.Scanner;

/**
 * This program asks the user to input three things:
 * 1. A season of the year (e.g., "summer", "winter")
 * 2. A whole number (e.g., 3, 5)
 * 3. An adjective (e.g., "sunny", "cold")
 * <p>
 * Then, it uses these inputs to output a sentence in the format:
 * "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee."
 * <p>
 * Example output:
 * On a cold winter day, I drink a minimum of 3 cups of coffee.
 */
public class SeasonCoffeeInputTask {

    public static void main(String[] args) {

        // 1. Get the season of the year
        System.out.println("Please enter a season of the year (e.g., summer, winter, spring, fall): ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Get the whole number
        System.out.println("Please enter a whole number (e.g., 1, 2, 3): ");
        int wholeNumber = scanner.nextInt();

        // 3. Get the adjective
        System.out.println("Please enter an adjective to describe the day (e.g., sunny, cold, rainy): ");
        String adjective = scanner.next();

        // 4. Display the result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}