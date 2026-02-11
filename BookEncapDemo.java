package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class Book {
    private String title;
   public void setTitle(String t) {
        title = t;
    }
    public String getTitle() {
        return title;
    }
}
public class BookEncapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.print("Enter book title: ");
        b.setTitle(sc.nextLine());
        System.out.println("Book Title: " + b.getTitle());
    }
}

