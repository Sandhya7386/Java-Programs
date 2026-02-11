package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class CelsiusToFahrenheit {
    static double convert(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit = " + convert(c));
    }
}

