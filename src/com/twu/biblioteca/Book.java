package com.twu.biblioteca;

public class Book {

    private String name;
    private String authorName;

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return this.name + "\t" + this.authorName;
    }
}
