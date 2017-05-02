package com.xala3pa.services;

import com.xala3pa.domains.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class BookStoreService {
    private Collection<Book> books = new ArrayList<>();

    public  BookStoreService(){
        Book thinking = new Book("0374275637", "Thinking, Fast and Slow",
                "Daniel Kahneman", 10, 234 );
        Book scala = new Book("1617290653", "Functional programing in Scala",
                " Rúnar Bjarnason", 20, 54 );
        Book sicp = new Book("0374275637", "SICP",
                "Harold Abelson, Gerald Jay Sussman, Julie Sussman", 15, 24 );

        books.add(thinking);
        books.add(scala);
        books.add(sicp);
    }

    public Book getBook(String isbn) {
        return new Book("0374275637", "Thinking, Fast and Slow",
                "Daniel Kahneman", 10, 234 );
    }

    public Collection<Book> getAllBooks() {
        return books;
    }
}
