package com.twu.biblioteca;

public class Book {
    private final String name;
    private final String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return name + "\t" + author;
    }
}
