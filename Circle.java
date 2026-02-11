package com.gqt_java.java_gqt.programs;
class Circle {
    double area(double r) {
        return 3.14 * r * r;
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area = " + c.area(7));
    }
}

