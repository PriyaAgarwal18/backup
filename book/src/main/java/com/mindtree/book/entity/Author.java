package com.mindtree.book.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	@Id
	private int authorId;
	private String authorName;
	@OneToMany(mappedBy="author",cascade = CascadeType.ALL)
	private List<Book> book;
	public Author() {
		
	}
	public Author(int authorId, String authorName, List<Book> book) {
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
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	

	
}
