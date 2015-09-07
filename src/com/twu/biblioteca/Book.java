package com.twu.biblioteca;

public class Book {
    private final String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
