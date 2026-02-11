package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class CarEncap {
    private String model, color;
    private double price;
    public void setCar(String m, String c, double p) {
        model = m;
        color = c;
        price = p;
    }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
}
public class CarEncap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarEncap c = new CarEncap();
        System.out.print("Enter model: ");
        String m = sc.nextLine();
        System.out.print("Enter color: ");
        String col = sc.nextLine();
        System.out.print("Enter price: ");
        double p = sc.nextDouble();
        c.setCar(m, col, p);
        System.out.println("Model: " + c.getModel());
        System.out.println("Color: " + c.getColor());
        System.out.println("Price: " + c.getPrice());
    }
}

