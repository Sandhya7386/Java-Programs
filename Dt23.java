package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Dt23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size:");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += mat[i][i];
        System.out.println("Sum of diagonal elements: " + sum);
    }
}

