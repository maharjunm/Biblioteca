package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DisplayTest {

    @Test
    public void shouldPrintTheString() {
        Display display = new Display("Maharjun");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        display.print();
        assertEquals("Maharjun\n", outContent.toString());
    }
}
