package com.mindtree.book.entitydto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.mindtree.book.entity.Book;

public class Publisherdto {
	private int publisherId;
	private String publisherName;
	private String publisherLog;
	
	private List<Bookdto> book;
	public Publisherdto() {
		
	}
	public Publisherdto(int publisherId, String publisherName, String publisherLog, List<Bookdto> book) {
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
	public List<Bookdto> getBook() {
		return book;
	}
	public void setBook(List<Bookdto> book) {
		this.book = book;
	}
	
	}
