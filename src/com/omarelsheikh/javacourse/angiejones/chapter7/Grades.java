package com.omarelsheikh.javacourse.angiejones.chapter7;

import java.util.Scanner;

/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */
public class Grades {

    private static int[] grades;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many grades will you enter?");
        grades = new int[scanner.nextInt()];

        getGrades();

        System.out.println("Sum: " + calculateSum());
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }

    // This method will get grades from the user
    public static void getGrades() {

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
    }

    // Calculate the sum of the grades
    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    // Calculate the average
    public static double calculateAverage() {
        return (double) calculateSum() / (double) grades.length;
    }

    // Find the highest grade
    public static int getHighest() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Find the lowest grade
    public static int getLowest() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}