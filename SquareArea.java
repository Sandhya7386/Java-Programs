package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class SquareArea {
    static double area(double s) {
        return s * s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        double s = sc.nextDouble();
        System.out.println("Area of Square = " + area(s));
    }
}

