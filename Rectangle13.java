package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Rectangle13 {
    private double length;
    private double breadth;
    public void setDimensions(double l, double b) {
        length = l;
        breadth = b;
    }
    public double getArea() {
        return length * breadth;
    }
    public double getPerimeter() {
        return 2 * (length + breadth);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle13 r = new Rectangle13();
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        r.setDimensions(l, b);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}

