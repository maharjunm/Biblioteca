package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class DelegatorTest {

    @Test
    public void shouldPrintOptions() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        delegator.start();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
    }

    @Test
    public void shouldPrintOptionsAndChooseOption() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        delegator.start();

        InOrder inOrder = inOrder(display);
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

        when(userInput.getInput()).thenReturn("1");
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
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print(library.checkedOut(userInput.getInput()));
    }

    @Test
    public void shouldPrintThankYouMessageWhenWeWantToCheckOutavailableBook() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        when(userInput.getInput()).thenReturn("2").thenReturn("Head First Java");
        delegator.start();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print(library.checkedOut(userInput.getInput()));
    }

    @Test
    public void shouldPrintInvalidMessageWhenWeWantToReturnUnavailableBook() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        when(userInput.getInput()).thenReturn("3").thenReturn("Maharjun");
        delegator.start();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print(library.returnBook(userInput.getInput()));
    }

    @Test
    public void shouldPrintThankYouMessageWhenWeWantToReturnAvailableBook() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        when(userInput.getInput()).thenReturn("3").thenReturn("Head First Java");
        library.checkedOut("Head First Java");
        delegator.start();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print(library.returnBook(userInput.getInput()));
    }

    @Test
    public void shouldPrintInvalidOptionWhenWeChooseInvalidOption() {
        Menu menu = mock(Menu.class);
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Delegator delegator = new Delegator(menu, userInput, display, library);

        when(userInput.getInput()).thenReturn("6");
        delegator.start();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print("Select a valid option!");
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
