package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class TrapezoidArea {
    static double area(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parallel sides and height: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of Trapezoid = " + area(a, b, h));
    }
}

