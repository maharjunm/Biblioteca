package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DisplayTest {

    @Test
    public void shouldPrintTheString() {
        Display display = new Display("Maharjun");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        display.print();
        Assert.assertEquals("Maharjun\n",outContent.toString());
    }
}
