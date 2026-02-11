package com.gqt_java.java_gqt.programs;
class Sphere {
    double volume(double r) {
        return (4.0/3) * 3.14 * r * r * r;
    }
    public static void main(String[] args) {
        Sphere s = new Sphere();
        System.out.println("Volume = " + s.volume(3));
    }
}

