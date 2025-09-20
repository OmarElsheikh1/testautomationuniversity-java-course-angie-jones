package com.omarelsheikh.javacourse.angiejones.chapter5;

import java.util.Scanner;

/**
 * A simple program to calculate a phone bill.
 * It takes the base plan cost and the number of overage minutes as input,
 * then calculates:
 *  - Overage fee ($0.25 per minute)
 *  - Tax (15% of subtotal)
 *  - Final total
 * Finally, it prints an itemized bill.
 */
public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter base cost of the plan: ");
        double baseCost = scanner.nextDouble();
        System.out.println("Enter overage minutes: ");
        int overageMinutes = scanner.nextInt();


    }
}