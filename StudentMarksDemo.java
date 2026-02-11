package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class Student {
    private int marks;
    public void setMarks(int m) {
        marks = m;
    }
    public int getMarks() {
        return marks;
    }
}
public class StudentMarksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter marks: ");
        s.setMarks(sc.nextInt());
        System.out.println("Marks: " + s.getMarks());
    }
}

