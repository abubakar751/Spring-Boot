package com.book_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String book_name;
	private String author;
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookEntity(int id, String book_name, String author) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", book_name=" + book_name + ", author=" + author + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
