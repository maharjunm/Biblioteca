package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookTest {

    String format = String.format("%-20S%-20S%-20S", "Head First Java", "Bert Bates", 2009);

    @Test
    public void shouldHaveNameForEachBookAndPrintIt() {
        Book book = new Book("Head First Java", "Bert Bates", 2009);

        assertEquals(format, book.toString());
    }

    @Test
    public void shouldHaveNameAndAuthorForEachBookAndPrintThem() {
        Book book = new Book("Head First Java", "Bert Bates", 2009);

        assertEquals(format, book.toString());
    }

    @Test
    public void shouldHaveNameAuthorAndYearPublishedForEachBookAndPrintThem() {
        Book book = new Book("Head First Java", "Bert Bates", 2009);

        assertEquals(format, book.toString());
    }

    @Test
    public void shouldReturnTrueTheBookIsToTheSameBook() {
        Book book = new Book("Head First Java", "Bert Bates", 2009);
        assertTrue(book.searchByname("Head First Java"));
    }
}
