package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class DemoEncap {
    private int value;
    public void setValue(int v) {
        value = v;
    }
    public int getValue() {
        return value;
    }
}
public class EncapsulationDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DemoEncap d = new DemoEncap();
        System.out.print("Enter value: ");
        d.setValue(sc.nextInt());
        System.out.println("Value: " + d.getValue());
    }
}

