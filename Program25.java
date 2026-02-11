package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        long result = 1;
       for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        System.out.println("Result: " + result);
    }
}

