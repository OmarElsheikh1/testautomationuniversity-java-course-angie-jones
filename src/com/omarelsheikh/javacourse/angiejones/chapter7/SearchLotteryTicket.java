package com.omarelsheikh.javacourse.angiejones.chapter7;

import java.util.Random;

/**
 * Problem: Update the LotteryTicket class to ensure that
 * each lottery ticket contains only unique numbers.
 * <p>
 * Details:
 * - The ticket currently generates 6 random numbers.
 * - Modify the logic so that no duplicate numbers appear in the ticket.
 * - Each number should be unique and within the allowed range (e.g., 1 to 6).
 */
public class SearchLotteryTicket {
    public static final int LENGTH = 6;
    public static final int MAX_TICKET_NUMBER = 100;

    public static void main(String[] args) {

        int[] ticketNumbers = generateNumbers();
        printTicketNumbers(ticketNumbers);
    }

    // Generate 6 random numbers between 1 and 6
    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {

            int randomNumber;

            // Generate random number then search to make sure it's not already in the array. If it
            // does exist, generate a new number and search again.
            // Repeat until a unique number is found.
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));
            // number is unique if we get here. Add it to the array.
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * This does a sequential search on the array to find a value.
     *
     * @param array        Array to search through
     * @param numberToFind Value to search for
     * @return True if found, false of not
     */
    public static boolean search(int[] array, int numberToFind) {

        // This is called an enhanced for loop.
        // It iterates through 'array' and
        // each time assigns the current element to 'value'.
        //
        for (int value : array) {           // for (int i = 0; i < array.length; i++) {
            if (value == numberToFind) {    //      if (array[i] == numberToFind) {
                return true; // found it    //          return true; // found it
            }                               //      }
        }                                   // }

        // if we've reached this point, then the entire array was searched
        // and the value was not found.
        return false;
    }

    // Print the numbers in the array
    public static void printTicketNumbers(int[] ticketNumbers) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticketNumbers[i] + " | ");
        }
    }
}