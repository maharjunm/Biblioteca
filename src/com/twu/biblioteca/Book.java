//Book has name, author and year it published and it will compares other book by it's name
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

    public boolean searchByname(String thatBookName) {
        if (this.name.equals(thatBookName))
            return true;
        return false;
    }
}
