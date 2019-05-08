package com.example.springboot.vaadin.mongodb.repositories;

import com.example.springboot.vaadin.mongodb.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByTitleStartsWithIgnoreCase(String title);
    List<Book> findByAuthorStartsWithIgnoreCase(String author);
}