package com.omarelsheikh.javacourse.angiejones.chapter4;

import java.util.Random;
import java.util.Scanner;

/**
 * A simple die game where the player tries to reach exactly space 20
 * within 5 rolls of a six-sided die.
 *
 * <p>Rules:</p>
 * <ul>
 *   <li>The player starts at space 0.</li>
 *   <li>Each roll moves the player forward 1–6 spaces.</li>
 *   <li>If the player lands exactly on space 20, they win.</li>
 *   <li>If the player goes past 20, they lose.</li>
 *   <li>If 5 rolls are used without reaching 20, they lose.</li>
 * </ul>
 */
public class RollTheDieGame {

    public static void main(String[] args) {

        boolean startGame = false;
        int targetSpace = 20;
        int maxRolls = 5;
        int currentPosition = 0;


        System.out.println("Start Game?");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        Random random = new Random();

        switch (choice.toUpperCase()) {

            case "YES":
                System.out.println("A simple die game where the player tries to reach exactly space 20\n" +
                        " * within 5 rolls of a six-sided die.");

                scanner.nextLine(); // clear out the leftover newline

                for (int i = 0; i < maxRolls; i++) {

                    System.out.println("Press Enter to roll the die...");
                    scanner.nextLine(); // waits until the user presses Enter

                    int dice = random.nextInt(1, 7);

                    System.out.println("You rolled a " + dice);
                    currentPosition += dice;
                    System.out.println("You are now on space " + currentPosition);

                    if (currentPosition == targetSpace) {
                        System.out.println("Congratulations! You reached space 20 and won the game!");
                        break;
                    } else if (currentPosition > targetSpace) {
                        System.out.println("Sorry, you went past space 20. You lose!");
                        break;
                    } else {
                        System.out.println("You need to reach space " + targetSpace + ". You have " + (maxRolls - (i + 1)) + " rolls left.");
                    }
                }
                // After the loop: final check
                if (currentPosition < targetSpace) {
                    System.out.println("You didn’t reach space 20 in 5 rolls. You lose!");
                }
                break;

            case "NO":
                System.out.println("Goodbye :) ");
                break;
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}