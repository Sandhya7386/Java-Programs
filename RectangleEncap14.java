package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class RectangleEncap14 {
    private double length;
    private double breadth;
   public void setLength(double l) {
        length = l;
    }
    public void setBreadth(double b) {
        breadth = b;
    }
    public double getArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RectangleEncap14 r = new RectangleEncap14();
        System.out.print("Enter length: ");
        r.setLength(sc.nextDouble());
        System.out.print("Enter breadth: ");
        r.setBreadth(sc.nextDouble());
        System.out.println("Area: " + r.getArea());
    }
}

