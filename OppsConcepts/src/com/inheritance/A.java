package com.inheritance;

public class A  {

	int a= 100;
	
	public A() {
		this.m1();
		 System.out.println("dddd");
	}
	
	public A(String st) {
		this.m2(); 
		System.out.println(st);
	}

	
	private void m1() {
		 System.out.println("This is m1 From parent class");
		 
	}
	
	private void m2() {
		 System.out.println("This is m2 From parent class");
	}
}
