package com.springcore.constructoeInjection;

public class Person {
	
	private int id;
	private String name;
	private Certificate certi;
	public Person(int id, String name, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certi=" + certi + "]";
	}
	
	
	
	
}
