package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class ReverseString {
    static String reverse(String s) {
        if (s.isEmpty())
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Reversed string = " + reverse(s));
    }
}

