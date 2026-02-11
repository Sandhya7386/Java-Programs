package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input : ");
        double r = sc.nextDouble();
       System.out.println("Area: " + (Math.PI * r * r));
        System.out.println("Perimeter: " + (2 * Math.PI * r));
    }
}

