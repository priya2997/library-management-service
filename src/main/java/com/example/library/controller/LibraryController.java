package com.example.library.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;
@Validated
@RestController
@RequestMapping("/books")
@Slf4j
public class LibraryController {

	@Autowired
	private BookRepository bookRepository;

	Logger log = LoggerFactory.getLogger(LibraryController.class);

	@PostMapping("/add")
	public Book addBook(@RequestBody Book book) {
		log.info("Inside addBook of BookController");
		//return libraryService.addBook(book);
		//return new ResponseEntity<Book>(libraryService.addBook(book), HttpStatus.CREATED);
		return bookRepository.save(book);
	}

	@GetMapping("/")
	public List<Book> fetchBook() {
		log.info("Inside fetchBook of BookController");
		return bookRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public String fetchAuthorByID(@PathVariable("id") String bookId) {
		log.info("Inside fetchAuthorByID of BookController");
		Book book = new Book();
		//return libraryService.fetchAuthorByID(bookId);
		//return new ResponseEntity<String>(libraryService.fetchAuthorByID(bookId), HttpStatus.OK);
	    book = bookRepository.findByBookId(bookId);
	    if (book != null && book.getAuthor() != null)
			return book.getAuthor();
		else
			return null;
	}

	

}
