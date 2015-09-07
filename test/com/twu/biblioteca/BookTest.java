package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void shouldHaveNameForEachBookAndPrintIt() {
        Book book = new Book("Head First Java", "Bert Bates", 2009);

        Assert.assertEquals("Head First Java\tBert Bates\t2009",book.toString());
    }

    @Test
    public void shouldHaveNameAndAuthorForEachBookAndPrintThem() {
        Book book = new Book("Head First Java","Bert Bates", 2009);

        Assert.assertEquals("Head First Java\tBert Bates\t2009",book.toString());
    }

    @Test
    public void shouldHaveNameAuthorAndYearPublishedForEachBookAndPrintThem() {
        Book book = new Book("Head First Java","Bert Bates",2009);

        Assert.assertEquals("Head First Java\tBert Bates\t2009",book.toString());
    }
}
