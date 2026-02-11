package com.gqt_java.java_gqt.programs;
class Power {
    double pow(double a, double b) {
        return Math.pow(a, b);
    }
    public static void main(String[] args) {
        Power p = new Power();
        System.out.println("Power = " + p.pow(2, 3));
    }
}

