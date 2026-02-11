package com.gqt_java.java_gqt.programs;
class Rhombus {
    double area(double d1, double d2) {
        return 0.5 * d1 * d2;
    }
    public static void main(String[] args) {
        Rhombus r = new Rhombus();
        System.out.println("Area = " + r.area(10, 8));
    }
}

