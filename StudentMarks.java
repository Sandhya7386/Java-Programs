package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class StudentMarks {
    private String name;
    private int rollNumber;
    private int marks;
    public void setName(String n) {
        name = n;
    }
    public void setRollNumber(int r) {
        rollNumber = r;
    }
    public void setMarks(int m) {
        marks = m;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public int getMarks() {
        return marks;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentMarks s = new StudentMarks();
        System.out.print("Enter name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter roll number: ");
        s.setRollNumber(sc.nextInt());
        System.out.print("Enter marks: ");
        s.setMarks(sc.nextInt());
        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNumber());
        System.out.println("Marks: " + s.getMarks());
    }
}

