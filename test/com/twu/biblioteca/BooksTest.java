package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BooksTest {

    @Test
    public void shouldPrintTheAllBooks() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        List<Book> list = new ArrayList<>();
        list.add(new Book("Head First Java", "Kathy Sierra", 2009));
        Books books = new Books(list);
        books.printBooksList();

        assertEquals("Head First Java\tKathy Sierra\t2009\n",byteArrayOutputStream.toString());
    }
}
