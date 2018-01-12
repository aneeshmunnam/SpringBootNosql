package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {

	@Id
	private String id;
	private String title;
	private String author;
	private int cost;
	private String published_by;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int cost, String published_by) {
		this.title = title;
		this.author = author;
		this.cost = cost;
		this.published_by = published_by;
	}
	
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getPublished_by() {
		return published_by;
	}

	public void setPublished_by(String published_by) {
		this.published_by = published_by;
	}
	
}
