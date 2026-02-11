package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Dt12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number as string:");
        String str = sc.nextLine();
        int num = Integer.parseInt(str);
        System.out.println("String to Integer: " + num);
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println("Integer to String: " + s);
    }
}

