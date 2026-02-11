package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter main string:");
        String s1 = sc.nextLine();
        System.out.println("Enter substring:");
        String s2 = sc.nextLine();
        if (s1.contains(s2))
            System.out.println("Substring found");
        else
            System.out.println("Substring not found");
    }
}

