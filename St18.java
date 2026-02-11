package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class St18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String[] words = sc.nextLine().split(" ");
        for (String w : words)
            System.out.print(w.substring(0,1).toUpperCase() + w.substring(1) + " ");
    }
}

