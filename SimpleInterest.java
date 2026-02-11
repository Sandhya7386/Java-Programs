package com.gqt_java.java_gqt.programs;
class SimpleInterest {
    double si(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();
        System.out.println("SI = " + s.si(1000, 5, 2));
    }
}

