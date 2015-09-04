package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BooksTest {

    @Test
    public void shouldPrintTheAllBooks() {
        Books books = new Books();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        books.printBooksList();

        assertEquals("Head First Java\nPragmatic Programming\nMartin's Refactoring\n",byteArrayOutputStream.toString());
    }
}
