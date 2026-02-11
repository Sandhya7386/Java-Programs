package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class Min {
    static int min(int a, int b) {
        return (a < b) ? a : b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Minimum number = " + min(a, b));
    }
}
