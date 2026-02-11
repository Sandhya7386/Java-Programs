package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Dt15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        if (str.equals(rev))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}

