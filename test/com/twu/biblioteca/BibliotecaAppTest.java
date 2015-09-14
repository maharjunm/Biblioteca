package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    @Test
    public void shouldPrintTheWelcomeMessageWhenWeStartApplication(){
        Display display = mock(Display.class);
        Delegator delegator = mock(Delegator.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(delegator,display);

        bibliotecaApp.start();

        verify(display,times(1)).print("Welcome to Biblioteca");
    }

    @Test
    public void shouldPrintTheWelcomeMessageAndStartTheApplicationWhenWeStartApplication(){
        Display display = mock(Display.class);
        Delegator delegator = mock(Delegator.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(delegator,display);

        bibliotecaApp.start();

        verify(display,times(1)).print("Welcome to Biblioteca");
        verify(delegator,times(1)).start();
    }
}
