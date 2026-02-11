package com.gqt_java.java_gqt.programs;
class Temp2 {
    double convert(double f) {
        return (f - 32) * 5/9;
    }
    public static void main(String[] args) {
        Temp2 t = new Temp2();
        System.out.println("Celsius = " + t.convert(77));
    }
}

