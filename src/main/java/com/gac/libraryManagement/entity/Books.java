package com.gac.libraryManagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;

    @Column(name = "book_name", length = 45, nullable = false)
    private String bookName;

    @Column(name = "category", length = 45)
    private String category;

    @Column(name = "author", length = 445)
    private String author;

    @Column(name = "availableQty")
    private int availableQty;

    @Column(name = "availability", length = 45)
    private String availability;

    @Column(name = "location", length = 25)
    private String location;

    @Column(name = "purchased_from", length = 355)
    private String purchasedFrom;

    @Column(name = "purchased_qty")
    private int purchasedQty;

    @Column(name = "PurchaseDate")
    private LocalDate purchaseDate;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "CreateTimestamp")
    private LocalDate createTimestamp;

    @Column(name = "UpdateTimestamp")
    private LocalDate updateTimestamp;

    @Column(name = "book_no")
    private int bookNo;

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPurchasedFrom() {
        return purchasedFrom;
    }

    public void setPurchasedFrom(String purchasedFrom) {
        this.purchasedFrom = purchasedFrom;
    }

    public int getPurchasedQty() {
        return purchasedQty;
    }

    public void setPurchasedQty(int purchasedQty) {
        this.purchasedQty = purchasedQty;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDate getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(LocalDate createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public LocalDate getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(LocalDate updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }
}
