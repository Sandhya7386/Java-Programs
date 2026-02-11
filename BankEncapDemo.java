package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class BankAccount {
    private int accountNumber;
    private double balance;
    public void setAccountNumber(int accNo) {
        accountNumber = accNo;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
   public double getBalance() {
        return balance;
    }
}
public class BankEncapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
       System.out.print("Enter account number: ");
        b.setAccountNumber(sc.nextInt());
        System.out.print("Enter deposit amount: ");
        b.deposit(sc.nextDouble());
        System.out.print("Enter withdraw amount: ");
        b.withdraw(sc.nextDouble());
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Final Balance: " + b.getBalance());
    }
}

