package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CheckOutMovieMenuItemTest {

    @Test
    public void shouldRetutnTheOption() {
        UserInput userInput = mock(UserInput.class);
        CheckOutMovieMenuItem menuItem = new CheckOutMovieMenuItem(userInput);

        assertEquals("Checkout Movie", menuItem.option());
    }

    @Test
    public void shouldTakeTheInputFromTheUser() {
        UserInput userInput = mock(UserInput.class);
        CheckOutMovieMenuItem menuItem = new CheckOutMovieMenuItem(userInput);

        menuItem.execute();

        verify(userInput, times(1)).getInput();
    }
}
