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
    public void shouldPrintTheOneBook() {
        ByteArrayOutputStream byteArrayOutputStream = getByteArrayOutputStream();
        List<Book> list = new ArrayList<>();
        list.add(new Book("Head First Java", "Kathy Sierra", 2009));
        Books books = new Books(list);
        books.printBooks();

        assertEquals("Book Name\tAuthour Name\tYear Published\nHead First Java\tKathy Sierra\t2009\n",byteArrayOutputStream.toString());
    }

    @Test
    public void shouldPrintTheAllBooks() {
        ByteArrayOutputStream byteArrayOutputStream = getByteArrayOutputStream();
        List<Book> list = new ArrayList<>();
        list.add(new Book("Head First Java", "Kathy Sierra", 2009));
        list.add(new Book("Pragmattic Programmer", "Andrew Hunt", 2009));
        list.add(new Book("Martin's Refactoring", "Martin Fowler", 2009));
        Books books = new Books(list);
        books.printBooks();

        assertEquals("Book Name\tAuthour Name\tYear Published\nHead First Java\tKathy Sierra\t2009\nPragmattic Programmer\tAndrew Hunt\t2009\nMartin's Refactoring\tMartin Fowler\t2009\n",byteArrayOutputStream.toString());
    }

    private ByteArrayOutputStream getByteArrayOutputStream() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        return byteArrayOutputStream;
    }
}
