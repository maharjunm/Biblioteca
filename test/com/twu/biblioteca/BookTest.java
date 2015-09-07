package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void shouldHaveNameForEachBookAndPrintIt() {
        Book book = new Book("Head First Java", "Bert Bates");

        Assert.assertEquals("Head First Java\tBert Bates",book.toString());
    }

    @Test
    public void shouldHaveNameAndAuthorForEachBookAndPrintThem() {
        Book book = new Book("Head First Java","Bert Bates");

        Assert.assertEquals("Head First Java\tBert Bates",book.toString());
    }
}
