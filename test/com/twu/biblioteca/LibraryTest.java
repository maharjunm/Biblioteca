package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void shouldPrintThePreexistingListOfBooks() {
        Library library = new Library();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        library.printBooksList();

        assertEquals("Head First Java\nPragmatic programmer\n", outContent.toString());
    }
}
