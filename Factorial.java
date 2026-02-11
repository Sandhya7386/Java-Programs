package com.gqt_java.java_gqt.programs;
class Factorial {
    int fact(int n) {
        int f = 1;
        for(int i=1;i<=n;i++) f *= i;
        return f;
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial = " + f.fact(5));
    }
}

