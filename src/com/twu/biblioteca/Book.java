package com.twu.biblioteca;

public class Book {

    private final String name;
    private final String author;
    private final int yearPublished;

    public Book(String name, String author, int yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        String format = String.format("%-20S%-20S%-20S", name, author, yearPublished);
        return format;
    }

    public String getName() {
        return name;
    }
}
