package com.twu.biblioteca;

public class Book {

    private String name;
    private String authorName;
    private int yearPublished;

    public Book(String name, String authorName, int yearPublished) {
        this.name = name;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return this.name + "\t" + this.authorName + "\t" + this.yearPublished;
    }
}
