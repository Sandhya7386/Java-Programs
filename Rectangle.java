package com.gqt_java.java_gqt.programs;
class Rectangle {
    int area(int l, int b) {
        return l * b;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Area = " + r.area(5, 4));
    }
}

