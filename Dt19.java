package com.gqt_java.java_gqt.programs;
import java.math.BigInteger;
import java.util.Scanner;
public class Dt19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        System.out.println("Factorial: " + fact);
    }
}

