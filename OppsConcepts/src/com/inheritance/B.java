package com.inheritance;

public class B extends A {
	
	public B(String st){
		System.out.println(st);
	}
	
	public B() {
		super("Pradeep");
		System.out.println("Non Para Const From Child"); 
	}
	
	private void m3() {
		 System.out.println("This is m3 From child Class "+ a);
	}
	
	private void m4() {
		 System.out.println("This is m4 From Child class");
	}
	
	public static void main(String[] args) {
			B b=new B();
			b.m3();
			b.m4();
	}

}
