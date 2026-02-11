package com.gqt_java.java_gqt.programs;

public class ThreadCode2 {
public static void main(String[] args) {
 System.out.println(Thread.currentThread());
	Thread t1=new Thread();
	System.out.println(t1);
	t1.start();
	 System.out.println(Thread.currentThread());
}
}
