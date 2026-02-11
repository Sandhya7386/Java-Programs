package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        String result = "";
        for (char c : s.toCharArray())
            if (!result.contains(String.valueOf(c)))
                result += c;
        System.out.println("String after removing duplicates: " + result);
    }
}

