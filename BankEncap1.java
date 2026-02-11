package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class BankEncap {
    private int accNo;
    private double balance;
    public void setAccount(int a) {
        accNo = a;
        balance = 0;
    }
    public void deposit(double amt) {
        balance += amt;
    }
    public void withdraw(double amt) {
        balance -= amt;
    }
    public double getBalance() {
        return balance;
    }
}
public class BankEncap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankEncap b = new BankEncap();
        System.out.print("Enter account number: ");
        b.setAccount(sc.nextInt());
        System.out.print("Enter deposit amount: ");
        b.deposit(sc.nextDouble());
        System.out.print("Enter withdraw amount: ");
        b.withdraw(sc.nextDouble());
       System.out.println("Balance: " + b.getBalance());
    }
}

