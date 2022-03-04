package com.yr.bookstore.controller;

import com.yr.bookstore.model.Book;
import com.yr.bookstore.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping(value = "/book")
    public void book(@RequestBody Book book) {
        bookService.createBook(book);
    }
}
