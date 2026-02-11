package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        str = str.replaceAll("\\s+", "");
      System.out.println("String without spaces: " + str);
    }
}

