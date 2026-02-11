package com.gqt_java.java_gqt.programs;
public class Dt7 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 3};
        int max = arr[0], min = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

