package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
public class Threadcode3 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Addition operation started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1:");
		int add1=sc.nextInt();
		System.out.println("Enter the num2:");
		int add2=sc.nextInt();
		int res1=add1+add2;
		System.out.println(res1);	
		System.out.println("Addition operation completed");
		System.out.println("Subtraction operation started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1:");
		int sub1=sc.nextInt();
		System.out.println("Enter the num2:");
		int sub2=sc.nextInt();
		int res2=sub1+sub2;
		System.out.println(res2);	
		System.out.println("Addition operation completed");
	}

}
