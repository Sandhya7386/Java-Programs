package com.gqt_java.java_gqt.programs;
import java.util.*;
public class St16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        System.out.println("Duplicate characters:");
        for (char c : s.toCharArray()) {
            if (!set.add(c))
                System.out.println(c);
        }
    }
}
