package com.gqt_java.java_gqt.programs;
class SquareRoot {
    double root(double n) {
        return Math.sqrt(n);
    }
    public static void main(String[] args) {
        SquareRoot s = new SquareRoot();
        System.out.println("Square Root = " + s.root(25));
    }
}

