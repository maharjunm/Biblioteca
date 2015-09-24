package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CheckOutMovieMenuItemTest {

    @Test
    public void shouldRetutnTheOption() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        CheckOutMovieMenuItem menuItem = new CheckOutMovieMenuItem(userInput, library);

        assertEquals("Checkout Movie", menuItem.option());
    }

    @Test
    public void shouldTakeTheInputFromTheUser() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        CheckOutMovieMenuItem menuItem = new CheckOutMovieMenuItem(userInput, library);

        menuItem.execute();

        verify(userInput, times(1)).getInput();
    }

    @Test
    public void shouldReturnTheCheckoutMovieMessage() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        CheckOutMovieMenuItem menuItem = new CheckOutMovieMenuItem(userInput,library);

        when(userInput.getInput()).thenReturn("Arjun");
        menuItem.execute();

        verify(library, times(1)).checkedOutMovie(userInput.getInput());
    }
}
