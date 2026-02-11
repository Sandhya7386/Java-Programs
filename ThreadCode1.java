package com.gqt_java.java_gqt.programs;

public class ThreadCode1 {
public static void main(String[] args) {
	Thread t1=new Thread();
	System.out.println(t1);
	t1.setName("Nandu");
	t1.setPriority(3);;
	System.out.println(t1);
}
}
