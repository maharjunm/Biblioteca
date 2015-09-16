package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class DelegatorTest {

    NormalMenu normalMenu = mock(NormalMenu.class);
    Library library = mock(Library.class);
    Display display = mock(Display.class);
    UserInput userInput = mock(UserInput.class);
    UserAccounts userAccounts = mock(UserAccounts.class);
    Delegator delegator = new Delegator(normalMenu, userInput, display, library, userAccounts);

    @Test
    public void shouldPrintOptions() {

        when(userInput.getInput()).thenReturn("1");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(normalMenu.toString());
    }

    @Test
    public void shouldPrintOptionsAndChooseOption() {

        when(userInput.getInput()).thenReturn("1");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(normalMenu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
    }

    @Test
    public void shouldGetTheInputFromTheUser() {


        when(userInput.getInput()).thenReturn("1");
        delegator.processTheOption();

        verify(userInput, times(1)).getInput();
    }

    @Test
    public void shouldPrintTheListBooksWhenWeChoose1() {

        when(userInput.getInput()).thenReturn("1");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(normalMenu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print(library.toString());
    }

    @Test
    public void shouldPrintTheListOfMoviesWhenWeChoose2() {

        when(userInput.getInput()).thenReturn("2");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(normalMenu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        verify(library, times(1)).listMovies();
    }

    @Test
    public void shouldCallTheCheckoutMovieFromTheLibraryWhenWeChoose3() {

        when(userInput.getInput()).thenReturn("3").thenReturn("Maharjun");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(normalMenu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        verify(library, times(1)).checkedOutMovie(userInput.getInput());
    }

    @Test
    public void shouldPrintTheInvalidMessageWhenPasswordsAreNotMatchedWhenWeChoose4() {

        when(userInput.getInput()).thenReturn("4").thenReturn("Maharjun").thenReturn("Maharjun");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(normalMenu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print("Invalid User Name or Password!");
    }

    @Test
    public void shouldPrintInvalidOptionWhenWeChooseInvalidOption() {

        when(userInput.getInput()).thenReturn("7");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(normalMenu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print("Select a valid option!");
    }

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldExitTheApplicationWhenWeChoose5() {
        exit.expectSystemExit();

        when(userInput.getInput()).thenReturn("5");

        delegator.processTheOption();

    }

    @Test
    public void shouldExitTheApplicationWhenWeChoose4FromTheWhileLoop() {
        exit.expectSystemExit();

        when(userInput.getInput()).thenReturn("5");

        delegator.start();

    }
}
