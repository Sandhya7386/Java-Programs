package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class LibraryBookMain {
    private String title;
    private String author;
    private double price;
    // setters
    public void setTitle(String t) {
        title = t;
    }
    public void setAuthor(String a) {
        author = a;
    }
    public void setPrice(double p) {
        price = p;
    }
    // getters
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
        LibraryBookMain book = new LibraryBookMain();
        System.out.print("Enter book title: ");
        book.setTitle(sc.nextLine());
        System.out.print("Enter author name: ");
        book.setAuthor(sc.nextLine());
        System.out.print("Enter price: ");
        book.setPrice(sc.nextDouble());
        System.out.println("\n--- Library Book Details ---");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
    }
}

