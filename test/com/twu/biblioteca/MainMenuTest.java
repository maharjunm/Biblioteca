package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainMenuTest {

    @Test
    public void shouldPrintTheMenuOptions() {
        MainMenu mainMenu = new MainMenu();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        mainMenu.printOptions();

        Assert.assertEquals("1.List Books\n",byteArrayOutputStream.toString());
    }
}
