package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class CylinderVolume {
    static double volume(double r, double h) {
        return 3.14 * r * r * h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height: ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Cylinder = " + volume(r, h));
    }
}

