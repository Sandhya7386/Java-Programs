package com.gqt_java.java_gqt.programs;
import java.util.*;
public class St17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                System.out.println("First repeating character: " + c);
                return;
            }
        }
        System.out.println("No repeating characters found");
    }
}

