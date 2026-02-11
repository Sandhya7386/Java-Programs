package com.gqt_java.java_gqt.programs;
class Minimum {
    int min(int a, int b) {
        return a < b ? a : b;
    }
    public static void main(String[] args) {
        Minimum m = new Minimum();
        System.out.println("Minimum = " + m.min(10, 25));
    }
}

