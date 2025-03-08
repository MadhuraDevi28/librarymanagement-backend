package com.gac.libraryManagement.controller;

import com.gac.libraryManagement.entity.Books;
import com.gac.libraryManagement.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/books/getall")
    public ResponseEntity<List<Books>> getAllBooks() {
        return new ResponseEntity<>(booksService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Books> getBookById(@PathVariable int id) {
        Optional<Books> book = booksService.getBookById(id);
        return book.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/books/create")
    public ResponseEntity<Books> addBook(@RequestBody Books book) {
        Books newBook = booksService.addBook(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }

    @PutMapping("/Books/{id}")
    public ResponseEntity<Books> updateBook(@PathVariable int id, @RequestBody Books book) {
        try {
            Books updatedBook = booksService.updateBook(id, book);
            return new ResponseEntity<>(updatedBook, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/books/delete/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        booksService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
