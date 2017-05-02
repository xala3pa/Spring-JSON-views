package com.xala3pa.controller;

import com.xala3pa.domains.Book;
import com.xala3pa.services.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BookStoreController {

    @Autowired
    private BookStoreService bookStoreService;

    @RequestMapping(method = RequestMethod.GET, value = "/books/{isbn}")
    public Book getBook(@PathVariable String isbn) {
        return bookStoreService.getBook(isbn);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/books")
    public Collection<Book> getAllBooks(){
        return bookStoreService.getAllBooks();

    }
}
