package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
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

    @Test
    public void shouldPrintTheWelcomeMessageOptionsAndChooseOption() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        delegator.start();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print("Welcome to Biblioteca");
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
    }

    @Test
    public void shouldGetTheInputFromTheUser() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        delegator.start();

        verify(userInput, times(1)).getInput();
    }

    @Test
    public void shouldPrintTheListBooksWhenWeChoose1() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        when(userInput.getInput()).thenReturn("1");
        delegator.start();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print("Welcome to Biblioteca");
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print(library.toString());
    }

    @Test
    public void shouldPrintInvalidBookWhenWeWantToCheckOutUnavialableBook() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        when(userInput.getInput()).thenReturn("2").thenReturn("Maharjun");
        delegator.start();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print("Welcome to Biblioteca");
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print(library.checkedOut(userInput.getInput()));
    }

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldExitTheApplicationWhenWeChoose4() {
        exit.expectSystemExit();

        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        when(userInput.getInput()).thenReturn("4");

        delegator.start();

    }
}
