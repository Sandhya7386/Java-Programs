package com.gqt_java.java_gqt.programs;
class Triangle {
    double area(double b, double h) {
        return 0.5 * b * h;
    }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Area = " + t.area(10, 5));
    }
}

