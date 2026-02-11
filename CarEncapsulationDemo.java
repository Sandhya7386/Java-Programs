package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class Car {
    private String model;
    private String color;
    private double price;
    public void setModel(String m) {
        model = m;
    }
    public void setColor(String c) {
        color = c;
    }
    public void setPrice(double p) {
        price = p;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
}
public class CarEncapsulationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c = new Car();
        System.out.print("Enter model: ");
        c.setModel(sc.nextLine());
        System.out.print("Enter color: ");
        c.setColor(sc.nextLine());
        System.out.print("Enter price: ");
        c.setPrice(sc.nextDouble());
       System.out.println("Model: " + c.getModel());
        System.out.println("Color: " + c.getColor());
        System.out.println("Price: " + c.getPrice());
    }
}

