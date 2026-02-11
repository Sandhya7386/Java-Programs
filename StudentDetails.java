package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class Student1 {
    private String name;
    private int rollNo;
    private int age;

    public Student1() {
    }
    public void setData(String n, int r, int a) {
        name = n;
        rollNo = r;
        age = a;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student1 s = new Student1();
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter roll number: ");
        int r = sc.nextInt();
        System.out.print("Enter age: ");
        int a = sc.nextInt();
        s.setData(n, r, a);
        s.display();
    }
}

