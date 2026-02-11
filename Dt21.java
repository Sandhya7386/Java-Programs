package com.gqt_java.java_gqt.programs;
import java.util.Arrays;
import java.util.Scanner;
public class Dt21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Ascending order:");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println("\nDescending order:");
        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}

