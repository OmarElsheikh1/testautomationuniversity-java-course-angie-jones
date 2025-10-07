package com.omarelsheikh.javacourse.angiejones.chapter7;

import java.util.Random;

/**
 * A simple lottery ticket generator.
 * Generates a set of 6 random numbers and prints them to the console.
 */
public class LotteryTicket {

    public static final int LENGTH = 6;
    public static final int MAX_TICKET_NUMBER = 6;

    public static void main(String[] args) {

        int[] ticketNumbers = generateNumbers();
        printTicketNumbers(ticketNumbers);
    }

    // Generate 6 random numbers between 1 and 6
    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }
        return ticket;
    }

    // Print the numbers in the array
    public static void printTicketNumbers(int[] ticketNumbers) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticketNumbers[i] + " | ");
        }
    }
}