package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class RegularPolygonArea {
    static double area(int n, double s) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sides and side length: ");
        int n = sc.nextInt();
        double s = sc.nextDouble();
    System.out.println("Area of Regular Polygon = " + area(n, s));
    }
}

