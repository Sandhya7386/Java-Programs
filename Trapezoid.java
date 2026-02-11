package com.gqt_java.java_gqt.programs;
class Trapezoid {
    double area(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }
    public static void main(String[] args) {
        Trapezoid t = new Trapezoid();
        System.out.println("Area = " + t.area(5, 7, 4));
    }
}

