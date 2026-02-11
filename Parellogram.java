package com.gqt_java.java_gqt.programs;
class Parallelogram {
    double area(double b, double h) {
        return b * h;
    }
    public static void main(String[] args) {
        Parallelogram p = new Parallelogram();
        System.out.println("Area = " + p.area(6, 5));
    }
}

