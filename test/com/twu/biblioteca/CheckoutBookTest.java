package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class CheckoutBookTest {

    @Test
    public void shouldGetTheNameOfTheBookToCheckout() {
        Library library = new Library();
        CheckoutBook checkoutBook = new CheckoutBook(library);
        String input = "Maharjun";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        assertEquals(input,checkoutBook.getInput());
    }

    @Test
    public void shouldReturnFalseWhenBookIsNotPresentInTheLibrary() {
        Library library = new Library();
        CheckoutBook checkoutBook = new CheckoutBook(library);
        String input = "Maharjun";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        checkoutBook.getInput();

        assertFalse(checkoutBook.isPresent());
    }

    @Test
    public void shouldReturnTrueWhenBookIsPresentInTheLibrary() {
        Library library = new Library();
        CheckoutBook checkoutBook = new CheckoutBook(library);
        String input = "Head First Java";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        checkoutBook.getInput();

        assertTrue(checkoutBook.isPresent());
    }
}
