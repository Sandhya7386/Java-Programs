package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        System.out.println("Longest word: " + longest);
    }
}

