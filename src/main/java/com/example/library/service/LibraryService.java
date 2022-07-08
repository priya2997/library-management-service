//package com.example.library.service;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.library.entity.Book;
//import com.example.library.repository.BookRepository;
//
//@Service
//public class LibraryService {
//
//	@Autowired
//	BookRepository bookRepository;
//
//	Logger log = LoggerFactory.getLogger(LibraryService.class);
//
//	public Book addBook(Book book) {
//		log.info("Inside addBook of BookService");
//		return bookRepository.save(book);
//	}
//
////	public List<Book> fetchBook() {
////		log.info("Inside fetchBook All");
////		return bookRepository.findAll();
////	}
//
//	public String fetchAuthorByID(long bookId) {
//		log.info("Inside fetchAuthorByID");
//		Book book = bookRepository.findByBookId(bookId);
//		if (book != null && book.getAuthor() != null)
//			return book.getAuthor();
//		else
//			return null;
//	}
//
//	
//
//	
//
//}
