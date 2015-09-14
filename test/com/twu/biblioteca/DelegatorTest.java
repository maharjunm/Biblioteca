package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.InOrder;

import java.util.Scanner;

import static org.mockito.Mockito.*;

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

    @Test
    public void shouldPrintTheWelcomeMessageAndOptions() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        delegator.start();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print("Welcome to Biblioteca");
        inOrder.verify(display, times(1)).print(menu.toString());
    }
}
