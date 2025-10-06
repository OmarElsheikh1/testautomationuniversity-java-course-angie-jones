package com.omarelsheikh.javacourse.angiejones.chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private double allottedMinutes;
    private double minutesUsed;
    private static final double OVERAGE_RATE = 0.25;
    private static final double TAX_RATE = 0.15;


    public PhoneBill() {
//        id = 0;
//        baseCost = 79.99;
//        allottedMinutes = 800;
//        minutesUsed = 800;
        this(0, 79.99, 800, 800);
    }

    public PhoneBill(int id) {
//        this.id = id;
//        baseCost = 79.99;
//        allottedMinutes = 800;
//        minutesUsed = 800;
        this(id, 79.99, 800, 800);
    }

    public PhoneBill(int id, double baseCost, double allottedMinutes, double minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setAllottedMinutes(double allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public double getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public double calculateOverage() {
        if (minutesUsed >= allottedMinutes) {
            return (minutesUsed - allottedMinutes) * OVERAGE_RATE;
        } else
            return 0;
    }

    public double calculateTax() {
        return (baseCost + calculateOverage()) * TAX_RATE;
    }

    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill() {
        System.out.println("=======================");
        System.out.println("Phone Bill Statement");
        System.out.println("=======================");
        System.out.println("Account ID: " + id);
        System.out.printf("Base Cost: $%.2f%n", baseCost);
        System.out.printf("Overage Charges: $%.2f%n", calculateOverage());
        System.out.printf("Tax: $%.2f%n", calculateTax());
        System.out.printf("Total: $%.2f%n", calculateTotal());
        System.out.println("=======================");
    }
}