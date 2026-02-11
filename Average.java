package com.gqt_java.java_gqt.programs;
class Average {
    int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        Average a = new Average();
        System.out.println("Average = " + a.avg(10, 20, 30));
    }
}

