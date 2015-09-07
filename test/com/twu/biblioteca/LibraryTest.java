package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {

    String format = String.format("%-20S%-20S%-20S", "Head First Java", "Bert Bates", 2009);

    @Test
    public void shouldPrintThePreExistingListOfBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Head First Java", "Bert Bates", 2009));
        Library library = new Library(books);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        library.printBooksList();
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "____________________________________________________________________";

        assertEquals(line + "\n" + header + "\n" + line + "\n" + format + "\n", outContent.toString());
    }
}
