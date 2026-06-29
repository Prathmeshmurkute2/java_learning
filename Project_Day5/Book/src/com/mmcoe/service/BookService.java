package com.mmcoe.service;

import com.mmcoe.pojo.Book;
import java.util.List;


public interface BookService {
	boolean save(Book b);
	
	Book find(int isbn) throws BookNotFoundException;
	
	List<Book> list();
	
	boolean delete(int isbn) throws BookNotFoundException;

	
	List<Book> findByPrice(double min,double max);
}
