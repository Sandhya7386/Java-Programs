package com.gqt_java.java_gqt.programs;
class Perimeter {
    int peri(int l, int b) {
        return 2 * (l + b);
    }
    public static void main(String[] args) {
        Perimeter p = new Perimeter();
        System.out.println("Perimeter = " + p.peri(5, 4));
    }
}

