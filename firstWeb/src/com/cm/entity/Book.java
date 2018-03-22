package com.cm.entity;

import java.util.Date;

public class Book {
    private int id;
    private String name;
    private double price;
    private String author;
    private Date pubDate;

    public Book() {
    }

    public Book(String name, double price, String author, Date pubDate) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.pubDate = pubDate;
    }

    public Book(int id, String name, double price, String author, Date pubDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.pubDate = pubDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}
