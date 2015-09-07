package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void shouldHaveNameForEachBookAndPrintIt() {
        Book book = new Book("Head First Java");

        Assert.assertEquals("Head First Java",book.toString());
    }
}
