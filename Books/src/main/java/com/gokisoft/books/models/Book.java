/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.books.models;

import java.io.Serializable;

/**
 *
 * @author dieptv
 */
public class Book implements Serializable{
    private String bookName;
    private float price;
    private String authorName;
    private String publishedDate;

    public Book() {
    }

    public Book(String bookName, float price, String authorName, String publishedDate) {
        this.bookName = bookName;
        this.price = price;
        this.authorName = authorName;
        this.publishedDate = publishedDate;
    }
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", price=" + price + ", authorName=" + authorName + ", publishedDate=" + publishedDate + '}';
    }
}
