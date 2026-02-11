package com.gqt_java.java_gqt.programs;
public class Dt8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum = 0;
        for (int i : arr)
            sum += i;
        System.out.println("Average: " + (sum / arr.length));
    }
}

