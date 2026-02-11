package com.gqt_java.java_gqt.programs;
class Polygon {
    double area(double n, double s) {
        return (n * s * s) / (4 * Math.tan(Math.PI/n));
    }
    public static void main(String[] args) {
        Polygon p = new Polygon();
        System.out.println("Area = " + p.area(6, 4));
    }
}

