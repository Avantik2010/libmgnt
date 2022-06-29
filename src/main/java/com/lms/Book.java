package com.lms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")

public class Book {
	
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	private int id;
	@Column(name = "title")
	private String title;
	@Column(name = "Author")
	private String Author;
	@Column(name = "category")
	private String category;
	
	public Book() {
		
	}
	
	public Book(String title, String author, String category) {
		super();
		this.title = title;
		Author = author;
		this.category = category;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", Author=" + Author + ", category=" + category + "]";
	}
	

}
