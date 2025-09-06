package com.omarelsheikh.javacourse.angiejones.chapter4;

import java.util.Scanner;

/**
 * Loop Break.
 * Search a String to determine if it contains the letter 'A'.
 */
public class LetterSearch {

    public static void main(String[] args) {

        char letterToFind = 'A';

        System.out.println("Enter a string to search for the letter '" + letterToFind + "': ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        // Flag to indicate of the letter was found
        boolean found = false;

        // Loop until you reach the end of the string
        for (int i = 0; i < inputString.length(); i++) {
            char currentLetter = inputString.charAt(i);
            if (currentLetter == letterToFind || currentLetter == Character.toLowerCase(letterToFind)) {
                System.out.println("The letter '" + letterToFind + "' was found in the string at place: " + (i + 1));
                found = true;
            }
        }

        // If the letter was not found, print a message
        if (!found) {
            System.out.println("There is no letter '" + letterToFind + "' in the string.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}