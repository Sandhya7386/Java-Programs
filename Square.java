package com.gqt_java.java_gqt.programs;
class Square {
    int area(int s) {
        return s * s;
    }
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println("Area = " + s.area(5));
    }
}

