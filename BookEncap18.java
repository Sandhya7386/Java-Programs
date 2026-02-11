package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class BookEncap18 {
    private String bookName;
    public void setBookName(String n) {
        bookName = n;
    }
    public String getBookName() {
        return bookName;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookEncap18 b = new BookEncap18();
        System.out.print("Enter book name: ");
        b.setBookName(sc.nextLine());
        System.out.println("Book Name: " + b.getBookName());
    }
}
