package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldReturnTheBookName() {
        Book book = new Book("Head First Java");

        assertEquals("Head First Java", book.toString());
    }

}
