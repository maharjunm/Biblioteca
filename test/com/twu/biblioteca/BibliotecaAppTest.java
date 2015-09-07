package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    @Test
    public void shouldPrintTheWelcomeMessage() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bibliotecaApp.start();

        assertEquals("Welcome To Biblioteca\n", outContent.toString());
    }
}