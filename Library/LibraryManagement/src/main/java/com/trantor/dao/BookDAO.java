package com.trantor.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trantor.entity.Book;
import com.trantor.repository.BookRepo;

@Repository
public class BookDAO {

	@Autowired
	private BookRepo bookRepo;

	public Book saveData(Book book) {
		
		return bookRepo.save(book) ;
	}

	public List<Book> getAllBooks() {
		List<Book> book = new ArrayList<Book>();
		bookRepo.findAll().forEach(books1 -> book.add(books1));
		return book;
	}

	public Optional<Book> deleteData(int id) {
		Optional<Book> b = bookRepo.findById(id);
		bookRepo.deleteById(id);
		return b;


	}
	public Book updateBook(int id,Book book) {
		Book bookFromDb=bookRepo.findById(id).get();
		bookFromDb .setAuthor(book.getAuthor());
		bookFromDb .setLanguage(book.getLanguage());
		bookFromDb .setPages(book.getPages());
		bookFromDb .setTitle(book.getTitle());
		bookFromDb .setPrice(book.getPrice());
		bookFromDb .setYear(book.getYear());
		bookRepo.save(bookFromDb);
		return book;
		
	}

}
