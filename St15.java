package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String[] words = sc.nextLine().split(" ");

        for (int i = words.length - 1; i >= 0; i--)
            System.out.print(words[i] + " ");
    }
}

