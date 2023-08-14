package com.springcore.referenceType;

public class DependantA {
	
	private int x;
	private DependancyB b;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public DependancyB getB() {
		return b;
	}
	public void setB(DependancyB b) {
		this.b = b;
	}
	public DependantA(int x, DependancyB b) {
		super();
		this.x = x;
		this.b = b;
	}
	public DependantA() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DependantA [x=" + x + ", b=" + b + "]";
	}
	
	
	
}
