package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnBookMenuItemTest {

    @Test
    public void shouldReturnTheOption() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        ReturnBookMenuItem returnBookMenuItem = new ReturnBookMenuItem(userInput, library);

        assertEquals("Return Book", returnBookMenuItem.option());
    }

    @Test
    public void shouldTakeTheInputFromTheUser() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        ReturnBookMenuItem returnBookMenuItem = new ReturnBookMenuItem(userInput, library);

        returnBookMenuItem.execute();

        verify(userInput, times(1)).getInput();
    }

    @Test
    public void shouldReturnTheReturnBookMessage() {
        UserInput userInput = mock(UserInput.class);
        Library library = mock(Library.class);
        ReturnBookMenuItem returnBookMenuItem = new ReturnBookMenuItem(userInput,library);

        returnBookMenuItem.execute();

        verify(library, times(1)).returnBook(userInput.getInput());
    }
}
