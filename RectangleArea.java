package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class RectangleArea {
    static double area(double l, double b) {
        return l * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle = " + area(l, b));
    }
}

