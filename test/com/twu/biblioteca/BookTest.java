package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldReturnTheBookName() {
        Book book = new Book("Head First Java", "Kathy Sierra", 2009);

        assertEquals("Head First Java\tKathy Sierra\t2009", book.toString());
    }

    @Test
    public void shouldReturnTheBookNameAndAuthorName() {
        Book book = new Book("Head First Java","Kathy Sierra", 2009);

        assertEquals("Head First Java\tKathy Sierra\t2009", book.toString());
    }

    @Test
    public void shouldReturnTheBookNameAuthorNameAndYearPublished() {
        Book book = new Book("Head First Java","Kathy Sierra",2009);

        assertEquals("Head First Java\tKathy Sierra\t2009", book.toString());
    }

}
