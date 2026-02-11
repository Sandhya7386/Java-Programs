package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class Test24 {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class EncapsulationDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test24 t = new Test24();
        System.out.print("Enter name: ");
        t.setName(sc.nextLine());
        System.out.println("Name: " + t.getName());
    }
}

