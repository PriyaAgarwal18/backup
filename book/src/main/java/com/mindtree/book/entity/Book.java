package com.mindtree.book.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
@Id
private int bookId;
private String bookName;
private int bookPrice;
@ManyToOne(cascade= CascadeType.ALL)
private Author author;
@ManyToOne(cascade = CascadeType.ALL)
private Publisher publisher;
public Book() {
	
}
public Book(int bookId, String bookName, int bookPrice, Author author, Publisher publisher) {
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
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public Publisher getPublisher() {
	return publisher;
}
public void setPublisher(Publisher publisher) {
	this.publisher = publisher;
}


}
