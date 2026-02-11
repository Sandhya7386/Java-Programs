package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class BankAccount25 {
    private int accNo;
    private double balance;
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount25 b = new BankAccount25();
        System.out.print("Enter account number: ");
        b.setAccNo(sc.nextInt());
        System.out.print("Enter deposit amount: ");
        b.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount: ");
        b.withdraw(sc.nextDouble());
        System.out.println("Final Balance: " + b.getBalance());
    }
}
