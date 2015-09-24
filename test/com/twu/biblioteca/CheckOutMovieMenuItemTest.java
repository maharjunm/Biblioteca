package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CheckOutMovieMenuItemTest {

    @Test
    public void shouldRetutnTheOption() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        CheckOutMovieMenuItem menuItem = new CheckOutMovieMenuItem(userInput, library, display);

        assertEquals("Checkout Movie", menuItem.option());
    }

    @Test
    public void shouldTakeTheInputFromTheUser() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        CheckOutMovieMenuItem menuItem = new CheckOutMovieMenuItem(userInput, library, display);

        menuItem.execute();

        verify(userInput, times(1)).getInput();
    }

    @Test
    public void shouldReturnTheCheckoutMovieMessage() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        CheckOutMovieMenuItem menuItem = new CheckOutMovieMenuItem(userInput, library, display);

        when(userInput.getInput()).thenReturn("Arjun");
        menuItem.execute();

        verify(library, times(1)).checkedOutMovie(userInput.getInput());
    }

    @Test
    public void shouldPrintTheCheckoutMovieMessage() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        CheckOutMovieMenuItem menuItem = new CheckOutMovieMenuItem(userInput, library, display);

        when(userInput.getInput()).thenReturn("Arjun");
        menuItem.execute();

        verify(display, times(1)).print(library.checkedOutMovie(userInput.getInput()));
    }
}
