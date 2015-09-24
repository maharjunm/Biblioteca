package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnBookMenuItemTest {

    @Test
    public void shouldReturnTheOption() {
        UserInput userInput = mock(UserInput.class);
        ReturnBookMenuItem returnBookMenuItem = new ReturnBookMenuItem(userInput);

        assertEquals("Return Book", returnBookMenuItem.option());
    }

    @Test
    public void shouldTakeTheInputFromTheUser() {
        UserInput userInput = mock(UserInput.class);
        ReturnBookMenuItem returnBookMenuItem = new ReturnBookMenuItem(userInput);

        returnBookMenuItem.execute();

        verify(userInput, times(1)).getInput();
    }
}
