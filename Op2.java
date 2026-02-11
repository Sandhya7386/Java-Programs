package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Op2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
       System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
    }
}

