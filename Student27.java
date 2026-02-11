package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Student27 {
    private String name;
    private int roll;
    private double marks;
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
    public double getMarks() {
        return marks;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student27 s = new Student27();
        System.out.print("Enter name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter roll number: ");
        s.setRoll(sc.nextInt());
        System.out.print("Enter marks: ");
        s.setMarks(sc.nextDouble());
        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRoll());
        System.out.println("Marks: " + s.getMarks());
    }
}

