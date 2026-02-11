package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class Encap28 {
    private String message;
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
public class EncapsulationDemo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encap28 e = new Encap28();
       System.out.print("Enter message: ");
        e.setMessage(sc.nextLine());
        System.out.println("Message: " + e.getMessage());
    }
}

