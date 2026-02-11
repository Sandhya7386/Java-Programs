package com.gqt_java.java_gqt.programs;
import java.util.*;
public class St22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.next();
        System.out.println("Enter second string:");
        String s2 = sc.next();
        HashSet<Character> set = new HashSet<>();
        for (char c : s1.toCharArray())
            if (s2.indexOf(c) != -1)
                set.add(c);
        System.out.println("Common characters: " + set);
    }
}

