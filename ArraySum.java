package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class ArraySum {
    static int sum(int[] a) {
        int s = 0;
        for (int i : a)
            s += i;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Sum of elements = " + sum(a));
    }
}

