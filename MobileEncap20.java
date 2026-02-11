package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class MobileEncap20 {
    private double price;
    public void setPrice(double p) {
        price = p;
    }
    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobileEncap20 m = new MobileEncap20();
        System.out.print("Enter price: ");
        m.setPrice(sc.nextDouble());
        System.out.println("Mobile Price: " + m.getPrice());
    }
}

