package com.lms;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LmsMain {

	public static void main(String[] args) {
		
            Configuration config= new Configuration ().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class);
            SessionFactory sessionFactory =config.buildSessionFactory();
            BookService bookservice= new BookServiceImpl (sessionFactory);
            List<Book> books=bookservice.findALL ();
          if (books==null)  
        	  System.out.println("No records");
            for (Book book : books) {
            	System.out.println(books);
            }
	}

}
