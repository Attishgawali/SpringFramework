package com.springcore.lifecycle;

public class Book {
	
	private int bookid;
	private String bookName;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		System.out.println("Setting book id ...");
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		System.out.println("Setting book name ...");
		this.bookName = bookName;
	}
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookid, String bookName) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
	}
	
	public void init() {
		System.out.println("Initi method is called ...");
		System.out.println("Connecting to Books database ...");
	}
	
	public void destroy() {
		System.out.println("destroy method is called ...");
		System.out.println("Clening up resources ...");
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + "]";
	}
	
}
