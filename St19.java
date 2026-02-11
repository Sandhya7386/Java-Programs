package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.next();
        System.out.println("Enter second string:");
        String s2 = sc.next();
        if ((s1 + s1).contains(s2))
            System.out.println("String is a rotation");
        else
            System.out.println("String is not a rotation");
    }
}

