package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Employee15 {
    private int id;
    private double salary;
    public void setDetails(int i, double s) {
        id = i;
        salary = s;
    }
    public double getAnnualSalary() {
        return salary * 12;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee15 e = new Employee15();
        System.out.print("Enter employee id: ");
        int id = sc.nextInt();
        System.out.print("Enter monthly salary: ");
        double sal = sc.nextDouble();
        e.setDetails(id, sal);
        System.out.println("Annual Salary: " + e.getAnnualSalary());
    }
}

