package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class RecPower {
    static int power(int a, int b) {
        if (b == 0)
            return 1;
        return a * power(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result = " + power(a, b));
    }
}

