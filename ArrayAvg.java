package com.gqt_java.java_gqt.programs;
class ArrayAvg {
    int avg(int[] a) {
        int sum = 0;
        for(int i : a) sum += i;
        return sum / a.length;
    }
    public static void main(String[] args) {
        ArrayAvg a = new ArrayAvg();
        System.out.println("Average = " + a.avg(new int[]{10,20,30}));
    }
}

