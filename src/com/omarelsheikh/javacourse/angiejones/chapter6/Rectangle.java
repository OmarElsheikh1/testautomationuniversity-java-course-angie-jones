package com.omarelsheikh.javacourse.angiejones.chapter6;

public class Rectangle {

    private double length;
    private double width;

    // Default constructor > Because it doesn't have parameters
    // It assigns default values to the fields
    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length); // or this.length = length;
        setWidth(width); // or this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double calculatePerimeter() {
        return (length + width) * 2;
    }

    double calculateArea() {
        return length * width;
    }
}