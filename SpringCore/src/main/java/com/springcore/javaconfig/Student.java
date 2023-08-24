package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;


public class Student {
	
	private Book book;
	
	@Value("Attish")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student(Book book, String name) {
		super();
		this.book = book;
		this.name = name;
	}
	
	public Student(Book book) {
		super();
		this.book = book;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public void Study() {
		System.out.println(" I am stuyding ...");
		book.display();
	}
	
	

}
