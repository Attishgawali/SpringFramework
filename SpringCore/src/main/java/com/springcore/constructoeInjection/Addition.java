package com.springcore.constructoeInjection;

public class Addition {
	
	private int a;
	private int b;
	
	public Addition(double a, double b) {
		this.a=(int)a;
		this.b =(int)b;
		System.out.println("construtor call double, double");
	}
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("construtor call int, int");
	}
	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("construtor call String, String");
	}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
	
	
}
