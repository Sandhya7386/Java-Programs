package com.gqt_java.java_gqt.programs;
class Cylinder {
    double volume(double r, double h) {
        return 3.14 * r * r * h;
    }
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        System.out.println("Volume = " + c.volume(3, 7));
    }
}

