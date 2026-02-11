package com.gqt_java.java_gqt.programs;

import java.util.Scanner;
public class BankAccountMain {
    private int accountNumber;
    private double balance;
    public void setAccountNumber(int accNo) {
        accountNumber = accNo;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccountMain acc = new BankAccountMain();
        System.out.print("Enter account number: ");
        acc.setAccountNumber(sc.nextInt());
        System.out.print("Enter deposit amount: ");
        acc.deposit(sc.nextDouble());
        System.out.print("Enter withdraw amount: ");
        acc.withdraw(sc.nextDouble());
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
