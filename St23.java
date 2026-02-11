package com.gqt_java.java_gqt.programs;
import java.util.*;
public class St23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine().toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray())
            if (c >= 'a' && c <= 'z')
                set.add(c);
        if (set.size() == 26)
            System.out.println("Pangram");
        else
            System.out.println("Not a Pangram");
    }
}

