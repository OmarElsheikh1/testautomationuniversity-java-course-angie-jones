package com.omarelsheikh.javacourse.angiejones.chapter5;

import java.util.Scanner;

/*
 * Our first method.
 * Write a method that asks a user for their name, then greets them by name.
 */
public class Greetings {

    public static void main(String[] args) {

        // Get the user's name
        System.out.println("Enter you name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // Call the method and greet the user
        greetUSer(name);
    }

    // Method that prints out greeting to user
    public static void greetUSer(String userName) {
        System.out.println("Hello " + userName);
    }
}