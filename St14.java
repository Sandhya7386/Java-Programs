package com.gqt_java.java_gqt.programs;
import java.util.*;
public class St14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        System.out.println("Character frequencies:");
        for (char c : map.keySet())
            System.out.println(c + " : " + map.get(c));
    }
}

