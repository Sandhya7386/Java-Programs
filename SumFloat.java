package com.gqt_java.java_gqt.programs;
class SumFloat {
    float add(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        SumFloat s = new SumFloat();
        System.out.println("Sum = " + s.add(10.5f, 20.5f));
    }
}

