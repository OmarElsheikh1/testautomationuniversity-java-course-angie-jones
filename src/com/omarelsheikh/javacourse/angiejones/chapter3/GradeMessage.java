package com.omarelsheikh.javacourse.angiejones.chapter3;

import java.util.Scanner;

/**
 * Switch statement.
 * Display a message based on the letter grade of a student.
 */
public class GradeMessage {

    public static void main(String[] args) {

        System.out.println("Please enter your Letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next().toUpperCase();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent work!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }
        System.out.println(message);
        scanner.close();
    }
}