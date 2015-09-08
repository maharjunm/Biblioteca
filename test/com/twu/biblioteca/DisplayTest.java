package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
;
import static org.junit.Assert.assertEquals;

public class DisplayTest {

    @Test
    public void shouldPrintTheString() {
        PrintStream printStream = new PrintStream(System.out);
        Display display = new Display(printStream);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        display.print("Maharjun");

        assertEquals("Maharjun\n",outContent.toString());
    }
}
