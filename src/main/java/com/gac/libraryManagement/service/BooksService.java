package com.gac.libraryManagement.service;

import com.gac.libraryManagement.entity.Books;

import java.util.List;
import java.util.Optional;

public interface BooksService {
    List<Books> getAllBooks();
    Optional<Books> getBookById(int id);
    Books addBook(Books book);
    Books updateBook(int id, Books book);
    void deleteBook(int id);
}
