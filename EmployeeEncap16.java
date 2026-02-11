package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class EmployeeEncap16 {
    private String name;
    private double salary;
    public void setName(String n) {
        name = n;
    }
    public void setSalary(double s) {
        salary = s;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeEncap16 e = new EmployeeEncap16();
        System.out.print("Enter employee name: ");
        e.setName(sc.nextLine());
        System.out.print("Enter salary: ");
        e.setSalary(sc.nextDouble());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}

