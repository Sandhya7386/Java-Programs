package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class CircleDemo {
    private double radius;
    public void setRadius(double r) {
        radius = r;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircleDemo c = new CircleDemo();
        System.out.print("Enter radius: ");
        c.setRadius(sc.nextDouble());
        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Circumference of Circle: " + c.getCircumference());
    }
}

