package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Op1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}

