package com.thapa.springspel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("authorBean")
public class Author {

    @Value("Sydney Sheldon")
    private String name;

    @Value("#{bookBean}")
    private Book book;

    @Value("#{bookBean.title}")
    private  String bookTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", book=" + book +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
