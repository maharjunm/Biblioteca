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
    public void shouldPrintTheThankYouWhenChooseAvailableBook() {
        Library library = new Library();

        Assert.assertEquals("Thank you! Enjoy the book", library.checkedOut("Head First Java"));
    }

    @Test
    public void shouldPrintTheInvalidMessageWhenChooseUnavailableBook() {
        Library library = new Library();

        Assert.assertEquals("That book is not available.", library.checkedOut("Maharjun"));
    }

    @Test
    public void shouldPrintTheInvalidMessageWhenWeWantToReturnInvalidBook() {
        Library library = new Library();

        Assert.assertEquals("That is not a valid book to return.", library.returnBook("Maharjun"));
    }

    @Test
    public void shouldPrintTheThankYouMessageWhenWeWantToReturnValidBook() {
        Library library = new Library();
        library.checkedOut("Head First Java");
        
        Assert.assertEquals("Thank you for returning the book.", library.returnBook("Head First Java"));
    }
}
