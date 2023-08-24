package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {
	
	//inserting expression
	@Value("#{5+9}")
	private int x;
	
	
	//inserting conditional expression
	@Value("#{9>5? 5:6}")
	private int y;
	
	
	//inserting static method
	@Value("#{ T(java.lang.Math).sqrt(25)}")
	private int sqrt;
	
	//inserting static varibale
	@Value("#{ T(java.lang.Math).PI}")
	private double PI;

	//inserting new object
	@Value("#{new java.lang.String('Attish')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSqrt() {
		return sqrt;
	}

	public void setSqrt(int sqrt) {
		this.sqrt = sqrt;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Example(int x, int y, int sqrt, double pI, String name, boolean isActive) {
		super();
		this.x = x;
		this.y = y;
		this.sqrt = sqrt;
		PI = pI;
		this.name = name;
		this.isActive = isActive;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [x=" + x + ", y=" + y + ", sqrt=" + sqrt + ", PI=" + PI + ", name=" + name + ", isActive="
				+ isActive + "]";
	}


	
	
	
	
	
	

}
