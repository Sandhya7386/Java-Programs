package com.gqt_java.java_gqt.programs;
import java.util.Scanner;

public class Rectangle23 {
    private double length, width, area;
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void calculateArea() {
        area = length * width;
    }
    public double getArea() {
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle23 r = new Rectangle23();
        System.out.print("Enter length: ");
        r.setLength(sc.nextDouble());
        System.out.print("Enter width: ");
        r.setWidth(sc.nextDouble());
        r.calculateArea();
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}
