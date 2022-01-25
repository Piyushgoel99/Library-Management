package com.trantor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantor.dao.BookDAO;
import com.trantor.entity.Book;

@Service
public class BookService {

	@Autowired
	private BookDAO bookDao;

	public Book saveData(Book book) {
		return bookDao.saveData(book);
	}

	public Optional<Book> deleteData(int id) {
		
		return bookDao.deleteData(id);

	}
	public Book updateBook(Book book,int id) {
		return bookDao.updateBook(id,book);
	}

	
	public List<Book> getData(){
		return bookDao.getAllBooks();
	}

}
