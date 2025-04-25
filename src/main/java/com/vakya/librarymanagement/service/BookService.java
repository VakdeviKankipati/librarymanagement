package com.vakya.librarymanagement.service;

import com.vakya.librarymanagement.model.Book;

import java.util.List;

public interface BookService {

    Book addBook(Book book);
    List<Book> getAllBooks();
}
