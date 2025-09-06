package com.omarelsheikh.javacourse.angiejones.chapter3;

import java.util.Scanner;

/**
 * If-else if statements.
 * Display a letter grade for a student based in their test score.
 */
public class TestResults {

    public static void main(String[] args) {

        // Get the test score
        System.out.println("Please enter the test score: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        // Validation
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
            return;
        }

        // Determine the letter grade
        char grade;

        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your Letter grade is: " + grade);
    }
}