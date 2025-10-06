package com.omarelsheikh.javacourse.angiejones.chapter6;

/*
 *Write a class that creates instances of the Rectangle class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {

    public static void main(String[] args) {

        //*** Rectangle 1 ***//
        // Create instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();


        //*** Rectangle 2 ***//
        // Create instance of Rectangle class
        Rectangle room2 = new Rectangle(65, 30);
        double areaOfRoom2 = room2.calculateArea();

        // Total area of the two rooms
        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Total area of the two rooms: " + totalArea + " square units");
    }
}