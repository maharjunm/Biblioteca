package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CheckoutBookTest {

    @Test
    public void shouldPrintTheThankYouWhenWeChooseAvialableBook() {
        Library library = new Library();
        Display display = new Display(new PrintStream(System.out));
        CheckoutBook checkoutBook = new CheckoutBook(library, display);
        String input = "Head First Java";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        checkoutBook.checkedOut(input);

        assertEquals("Thank you! Enjoy the book\n", outContent.toString());
    }

    @Test
    public void shouldPrintAMessageWhenWeChooseUnavialableBook() {
        Library library = new Library();
        Display display = new Display(new PrintStream(System.out));
        CheckoutBook checkoutBook = new CheckoutBook(library, display);
        String input = "Maharjun";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        checkoutBook.checkedOut(input);

        assertEquals("That book is not available.\n", outContent.toString());
    }


}
