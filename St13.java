package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St13 {
    static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        permute(s, "");
    }
}

