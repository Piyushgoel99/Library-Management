package com.trantor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Book_Table")
public class Book {

	@Id
	@GeneratedValue
	private Integer id;
	private String author;
	private String language;
	private Integer pages;
	private String title;
	private Integer price;
	private Integer year;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language=language;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages=pages;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	

	
}
