package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    String format = String.format("%-20S%-20S%-20S", "Head First Java", "Bert Bates", 2009);

    @Test
    public void shouldPrintThePreExistingListOfBooks() {
        Library library = new Library();
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "____________________________________________________________________";

        assertEquals(line + "\n" + header + "\n" + line + "\n" + format , library.toString());
    }

    @Test
    public void shouldReturnTheFalseWhenBookIsNotPresent() {
        Library library = new Library();

        assertFalse(library.findByBookName("Maharjun"));
    }

    @Test
    public void shouldReturnTheTrueWhenBookIsPresent() {
        Library library = new Library();

        assertTrue(library.findByBookName("Head First Java"));
    }
}
