package com.omarelsheikh.javacourse.angiejones.chapter4;

import java.util.Scanner;

/**
 * Nested Loops.
 * Find the average of each student's test scores.
 */
public class AverageTestScores {

    public static void main(String[] args) {

        // Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        // Process all students
        for (int i = 0; i < numberOfStudents; i++) {

            double total = 0.0;

            for (int j = 0; j < numberOfTests; j++) {

                System.out.println("Enter the score for test #" + (j + 1) + " for student #" + (i + 1) + ": ");
                double score = scanner.nextDouble();
                total = total + score;
            }

            // Calculate the average for the current student
            double average = total / numberOfTests;
            System.out.println("The test average for student #" + (i + 1) + " is: " + average);
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}