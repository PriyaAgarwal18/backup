package com.mindtree.book.entitydto;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

import com.mindtree.book.entity.Author;
import com.mindtree.book.entity.Publisher;

public class Bookdto {
	private int bookId;
	private String bookName;
	private int bookPrice;
	
	private Authordto author;
	
	private Publisherdto publisher;
	public Bookdto() {
		
	}
	public Bookdto(int bookId, String bookName, int bookPrice, Authordto author, Publisherdto publisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.author = author;
		this.publisher = publisher;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Authordto getAuthor() {
		return author;
	}
	public void setAuthor(Authordto author) {
		this.author = author;
	}
	public Publisherdto getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisherdto publisher) {
		this.publisher = publisher;
	}
	
}
