package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Dt24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();
        System.out.println("Transpose Matrix:");
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}

