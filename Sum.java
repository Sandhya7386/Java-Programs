package com.gqt_java.java_gqt.programs;
class Sum {
    int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println("Sum = " + s.add(10, 20));
    }
}

