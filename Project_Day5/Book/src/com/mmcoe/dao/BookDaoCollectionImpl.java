package com.mmcoe.dao;

import java.util.List;
import java.util.Vector;

import com.mmcoe.pojo.Book;

public class BookDaoCollectionImpl  implements BookDao {
	
	private List<Book> books;
	
	public BookDaoCollectionImpl() {
		books = new Vector<Book>();
	}
	
	@Override
	public boolean save(Book b) {
		books.add(b);
		return true;
	}
	
	@Override
	public Book find(int isbn) {
		for(Book i : books) {
			if(i.getIsbn() == isbn) {
				return i;
			}
		}
		return null;
	}
	
	
	
	@Override
	public List<Book> findByPrice(double min, double max) {
		List<Book> foundBook = new Vector<>();
		for(Book b:books) {
			if(b.getPrice()>= min && b.getPrice()<=max) {
				foundBook.add(b);
			}
		}
		return foundBook;
	}

	@Override
	public List<Book> list(){
		return books;
	}

	@Override
	public boolean delete(int isbn) {
		for(Book i : books) {
			if(i.getIsbn() == isbn) {
				books.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	
}
