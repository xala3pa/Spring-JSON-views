package com.xala3pa.domains;

import com.fasterxml.jackson.annotation.JsonView;
import com.xala3pa.views.Views;

public class Book {
    @JsonView(Views.Public.class)
    private String ISBN;
    @JsonView(Views.Public.class)
    private String name;
    @JsonView(Views.Public.class)
    private String author;
    @JsonView(Views.Internal.class)
    private Integer price;
    @JsonView(Views.Internal.class)
    private Integer stockUnits;
    
    public Book(String ISBN, String name, String author, Integer price, Integer stockUnits) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.price = price;
        this.stockUnits = stockUnits;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStockUnits() {
        return stockUnits;
    }
}
