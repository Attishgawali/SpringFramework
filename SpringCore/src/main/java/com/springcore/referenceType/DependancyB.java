package com.springcore.referenceType;

public class DependancyB {
	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public DependancyB(int y) {
		super();
		this.y = y;
	}

	public DependancyB() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DependancyB [y=" + y + "]";
	}
	
	
}
