package com.example.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.example.library.entity.Book;


@Repository
public class BookRepository  {
	
	@Autowired
	private DynamoDBMapper dynamoDBMapper;


    public Book save(Book book) {
        dynamoDBMapper.save(book);
        return book;
    }

    public Book findByBookId(String bookId) {
        return dynamoDBMapper.load(Book.class, bookId);
    }

	public List<Book> findAll() {
		
		 return dynamoDBMapper.scan(Book.class, new DynamoDBScanExpression());
	}

	//Book findByBookId(long bookId);

}
