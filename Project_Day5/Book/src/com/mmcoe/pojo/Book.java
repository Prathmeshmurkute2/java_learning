package com.mmcoe.pojo;

public class Book {
	
	private int isbn;
	private String title, author;
	private double price;
	
	public Book() {}
	
	public Book(int isbn, String title, String author, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [ISBN=" + isbn + ", Title=" +title + ", Author=" + author +", Price=" +price +"]";
	}
	
	//getter & setter
	
	public int getIsbn() {
		return isbn;
	}
	
	public double getPrice() {
		return price;
	}
	

}
