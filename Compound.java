package com.gqt_java.java_gqt.programs;
class Compound {
    double ci(double p, double r, double t) {
        return p * Math.pow(1 + r/100, t);
    }
    public static void main(String[] args) {
        Compound c = new Compound();
        System.out.println("CI = " + c.ci(1000, 10, 2));
    }
}

