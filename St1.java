package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        System.out.println("Reversed string: " + rev);
    }
}

