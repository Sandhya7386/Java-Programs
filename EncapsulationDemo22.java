package com.gqt_java.java_gqt.programs;
class Demo {
    private int value;
    public void setValue(int v) {
        value = v;
    }
    public int getValue() {
        return value;
    }
}
public class EncapsulationDemo22 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.setValue(100);
        System.out.println("Value: " + d.getValue());
    }
}

