package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class FahrenheitToCelsius {
    static double convert(double f) {
        return (f - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Temperature in Celsius = " + convert(f));
    }
}

