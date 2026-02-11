package com.gqt_java.java_gqt.programs;
import java.util.Arrays;
import java.util.Scanner;
public class Dt22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Second Smallest: " + arr[1]);
        System.out.println("Second Largest: " + arr[n - 2]);
    }
}

