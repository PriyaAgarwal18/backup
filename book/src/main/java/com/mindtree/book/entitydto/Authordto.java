package com.mindtree.book.entitydto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.mindtree.book.entity.Book;

public class Authordto {
	private int authorId;
	private String authorName;
	
	private List<Bookdto> book;
	public Authordto() {
		
	}
	public Authordto(int authorId, String authorName, List<Bookdto> book) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.book = book;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public List<Bookdto> getBook() {
		return book;
	}
	public void setBook(List<Bookdto> book) {
		this.book = book;
	}
	
}
