package com.gqt_java.java_gqt.programs;
public class Dt3 {
    public static void main(String[] args) {
        int num = 10;
        String binary = Integer.toBinaryString(num);
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
    }
}

