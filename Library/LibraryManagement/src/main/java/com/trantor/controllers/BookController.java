package com.trantor.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trantor.entity.Book;
import com.trantor.services.BookService;

@RestController
@RequestMapping(path="/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping(path="/add",produces = { "application/json" }, consumes = { "application/json" })
	public Book saveBookData(@RequestBody Book book) {
		return bookService.saveData(book);
	}

	@GetMapping("/search")
	private List<Book> getAllBooks() {
		return bookService.getData(); 

	}

	@DeleteMapping("/delete")
	public Optional<Book> delete(@RequestParam int id) {
		return bookService.deleteData(id);
//		return "Book Deleted";
	}
	 
  @PutMapping("/update")
  public Book update(@RequestBody Book book,int id) {
	  return bookService.updateBook(book,id);
  }
	

}  
