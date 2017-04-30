package com.xala3pa.services;

import com.xala3pa.domains.Book;
import org.springframework.stereotype.Service;

@Service
public class BookStoreService {
    public Book getBook(String isbn) {
        return new Book("0374275637", "Thinking, Fast and Slow",
                "Daniel Kahneman", 10, 234 );
    }
}
