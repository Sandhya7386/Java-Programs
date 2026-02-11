package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        boolean isDigit = str.matches("\\d+");
        if (isDigit)
            System.out.println("String contains only digits");
        else
            System.out.println("String does not contain only digits");
    }
}

