package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter main string:");
        String s = sc.next();
        System.out.println("Enter pattern string:");
        String p = sc.next();
        int minLen = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                boolean found = true;
                for (char c : p.toCharArray())
                    if (sub.indexOf(c) == -1)
                        found = false;
                if (found && sub.length() < minLen) {
                    minLen = sub.length();
                    result = sub;
                }
            }
        }
        System.out.println("Smallest window: " + result);
    }
}

