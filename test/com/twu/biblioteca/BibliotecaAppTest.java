package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BibliotecaAppTest {

    @Test
    public void shouldPrintTheWelcomeMessage() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        bibliotecaApp.printWelcomeMessage();

        Assert.assertEquals("Welcome to Biblioteca\n", byteArrayOutputStream.toString());
    }

    @Test
    public void shouldPrintTheWelcomeMessageWhenWeStartTheApplication() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        bibliotecaApp.start();

        Assert.assertEquals("Welcome to Biblioteca\n", byteArrayOutputStream.toString());
    }
}