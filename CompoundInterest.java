package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class CompoundInterest {
    static double ci(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, rate and time: ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        System.out.println("Compound Interest = " + ci(p, r, t));
    }
}

