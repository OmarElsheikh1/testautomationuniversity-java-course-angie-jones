package com.omarelsheikh.javacourse.angiejones.chapter6;

public class PhoneBillCalculator {

    public static void main(String[] args) {

        PhoneBill phoneBill1 = new PhoneBill(1, 2, 2, 2);
//        phoneBill1.setMinutesUsed(850);
//        phoneBill1.calculateOverage();
//        phoneBill1.calculateTax();
//        phoneBill1.calculateTotal();
        phoneBill1.printItemizedBill();
    }
}