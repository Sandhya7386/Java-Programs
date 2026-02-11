package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println("First non-repeated character: " + str.charAt(i));
                break;
            }
        }
    }
}

