package com.gqt_java.java_gqt.programs;
class Temp {
    double convert(double c) {
        return (c * 9/5) + 32;
    }
    public static void main(String[] args) {
        Temp t = new Temp();
        System.out.println("Fahrenheit = " + t.convert(25));
    }
}

