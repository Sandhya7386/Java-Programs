package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class Sample26 {
    private int number;
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
}
public class EncapsulationDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sample26 s = new Sample26();
        System.out.print("Enter number: ");
        s.setNumber(sc.nextInt());
        System.out.println("Number: " + s.getNumber());
    }
}
