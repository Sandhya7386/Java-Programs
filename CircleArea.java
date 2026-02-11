package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class CircleArea {
    static double area(double r) {
        return 3.14 * r * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + area(r));
    }
}

