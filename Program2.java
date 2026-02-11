package com.gqt_java.java_gqt.programs;
public class Program2 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=100;i++){
			if(i%2==0){
				sum=sum+i;
			}
		}
		System.out.println("Sum of even numbers between 1 to 100 is : "+sum);
			}
}
