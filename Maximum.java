package com.gqt_java.java_gqt.programs;
class Maximum {
    int max(int a, int b) {
        return a > b ? a : b;
    }
    public static void main(String[] args) {
        Maximum m = new Maximum();
        System.out.println("Maximum = " + m.max(10, 25));
    }
}
