package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class CheckoutBookTest {

    @Test
    public void shouldGetTheNameOfTheBookToCheckout() {
        CheckoutBook checkoutBook = new CheckoutBook();
        String input = "Maharjun";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        assertEquals(input,checkoutBook.getInput());
    }
}
