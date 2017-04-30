package com.xala3pa.domains;

public class Book {
    private String ISBN;

    private String name;
    private String author;
    private Integer price;
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
