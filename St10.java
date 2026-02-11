package com.gqt_java.java_gqt.programs;
import java.util.Arrays;
import java.util.Scanner;
public class St10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.next().toLowerCase();
        System.out.println("Enter second string:");
        String s2 = sc.next().toLowerCase();
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are not Anagrams");
    }
}

