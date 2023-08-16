package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean,DisposableBean {
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Car(int price) {
		super();
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// this init method
		System.out.println("Connection to car server ....");
		
	}

	public void destroy() throws Exception {
		// this is destroy method
		System.out.println("Cleaning up car resources ...");
		
	}
	
	

}
