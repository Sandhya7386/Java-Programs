package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class SimpleInterest1 {
    static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, rate and time: ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        System.out.println("Simple Interest = " + calculateSI(p, r, t));
    }
}

