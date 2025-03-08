package com.gac.libraryManagement.service;

import com.gac.libraryManagement.entity.Books;
import com.gac.libraryManagement.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BooksService {
    @Autowired
    private final BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }

    public Optional<Books> getBookById(int id) {
        return booksRepository.findById(id);
    }

    public Books addBook(Books book) {
        return booksRepository.save(book);
    }


    public Books updateBook(int id, Books book) {
        Optional<Books> books=booksRepository.findById(id);
        if (books.isPresent()){
            return booksRepository.save(book);
        }
        else {

            return null;
        }

    }

    public void deleteBook(int id) {
     booksRepository.deleteById(id);
    }
}
