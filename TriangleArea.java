package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class TriangleArea {
    static double area(double b, double h) {
        return 0.5 * b * h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and height: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of Triangle = " + area(b, h));
    }
}

