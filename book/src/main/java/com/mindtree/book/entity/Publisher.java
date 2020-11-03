package com.mindtree.book.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {
	@Id
	private int publisherId;
	private String publisherName;
	private String publisherLog;
	@OneToMany(mappedBy="publisher",cascade=CascadeType.ALL)
	private List<Book> book;
	public Publisher() {
		
	}
	public Publisher(int publisherId, String publisherName, String publisherLog, List<Book> book) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.publisherLog = publisherLog;
		this.book = book;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherLog() {
		return publisherLog;
	}
	public void setPublisherLog(String publisherLog) {
		this.publisherLog = publisherLog;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	

}
