package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class ComputerMain {
    private String brand;
    private String model;
    private double price;
    // setters
    public void setBrand(String b) {
        brand = b;
    }
    public void setModel(String m) {
        model = m;
    }
    public void setPrice(double p) {
        price = p;
    }
    // getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComputerMain c = new ComputerMain();
        System.out.print("Enter computer brand: ");
        c.setBrand(sc.nextLine());
        System.out.print("Enter computer model: ");
        c.setModel(sc.nextLine());
        System.out.print("Enter computer price: ");
        c.setPrice(sc.nextDouble());
        System.out.println("\n--- Computer Details ---");
        System.out.println("Brand: " + c.getBrand());
        System.out.println("Model: " + c.getModel());
        System.out.println("Price: " + c.getPrice());
    }
}
