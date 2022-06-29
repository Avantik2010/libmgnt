package com.lms;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookServiceImpl implements BookService {
	
	
	private SessionFactory sessionFactory;
	private Session session;
	
	public BookServiceImpl (SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession ();
	}

	@Override
	public List<Book> findALL() {
	
		Transaction tx = session.beginTransaction();
		List<Book> books=session.createQuery("from Book").list();
		//hsQL
		tx.commit ();
		return books;
	}

	@Override
	public Book findById(int id) {
		
		Book book=new Book();
		Transaction tx = session.beginTransaction();
		book= session.get(Book.class,id);
		
		tx.commit ();
		return book;
	}

	@Override
	public void deleteById(int id) {
		
		
	}

	@Override
	public void save(Book book) {
		
		
	}

	@Override
	public List<Book> search(String title, String author) {
		
		return null;
	}
	
	
	

}
