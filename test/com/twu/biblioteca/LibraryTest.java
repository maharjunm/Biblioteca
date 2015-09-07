package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void shouldPrintThePreExistingListOfBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Head First Java", "Bert Bates", 2009));
        Library library = new Library(books);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        library.printBooksList();
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "_____________________________________________";

        assertEquals(line + "\n" + header + line + "\n" + "Head First Java\tBert Bates\t2009\n", outContent.toString());
    }
}
