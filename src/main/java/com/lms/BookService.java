package com.lms;

import java.util.List;

public interface BookService {
	
	public List<Book> findALL();
	
	public Book findById (int id);
	
	public void deleteById (int id);
	
	public void save (Book book);
	
	public List<Book> search(String title, String author);
	
}
