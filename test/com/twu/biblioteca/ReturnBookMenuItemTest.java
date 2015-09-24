package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReturnBookMenuItemTest {

    @Test
    public void shouldReturnTheOption() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        ReturnBookMenuItem returnBookMenuItem = new ReturnBookMenuItem(userInput, library, display);

        assertEquals("Return Book", returnBookMenuItem.option());
    }

    @Test
    public void shouldTakeTheInputFromTheUser() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        ReturnBookMenuItem returnBookMenuItem = new ReturnBookMenuItem(userInput, library, display);

        returnBookMenuItem.execute();

        verify(userInput, times(1)).getInput();
    }

    @Test
    public void shouldReturnTheReturnBookMessage() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        ReturnBookMenuItem returnBookMenuItem = new ReturnBookMenuItem(userInput, library, display);

        returnBookMenuItem.execute();

        verify(library, times(1)).returnBook(userInput.getInput());
    }

    @Test
    public void shouldPrintTheReturnBookMessage() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        ReturnBookMenuItem returnBookMenuItem = new ReturnBookMenuItem(userInput, library, display);

        when(userInput.getInput()).thenReturn("Maharjun");
        returnBookMenuItem.execute();

        verify(display, times(1)).print(library.returnBook(userInput.getInput()));
    }
}
