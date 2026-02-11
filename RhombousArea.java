package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class RhombusArea {
    static double area(double d1, double d2) {
        return 0.5 * d1 * d2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diagonals: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Area of Rhombus = " + area(d1, d2));
    }
}

