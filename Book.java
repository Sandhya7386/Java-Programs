package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Book {
    private String title;
    private String author;
    private double price;
    public void setTitle(String t) {
        title = t;
    }
    public void setAuthor(String a) {
        author = a;
    }
    public void setPrice(double p) {
        price = p;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.print("Enter title: ");
        b.setTitle(sc.nextLine());
        System.out.print("Enter author: ");
        b.setAuthor(sc.nextLine());
        System.out.print("Enter price: ");
        b.setPrice(sc.nextDouble());
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: " + b.getPrice());
    }
}

