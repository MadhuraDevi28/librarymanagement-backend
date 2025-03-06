package com.gac.libraryManagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users_books_history")
public class UserBooksHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BookHistoryId")
    private int bookHistoryId;

    @Column(name = "BorrowDate")
    private LocalDate borrowDate;

    @Column(name = "ReturnDate")
    private LocalDate returnDate;

    @Column(name = "book_id")
    private int bookId;

    @Column(name = "user_id")
    private int userId;

    // Getters and Setters
    public int getBookHistoryId() {
        return bookHistoryId;
    }

    public void setBookHistoryId(int bookHistoryId) {
        this.bookHistoryId = bookHistoryId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
