package com.twu.biblioteca;

import org.junit.Test;

import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DelegatorTest {

    @Test
    public void shouldPrintTheWelcomeMessage() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        delegator.start();

        verify(display, times(1)).print("Welcome to Biblioteca");
    }
}
