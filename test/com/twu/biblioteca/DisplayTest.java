package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DisplayTest {

    @Test
    public void shouldPrintTheString() {
        PrintStream printStream = mock(PrintStream.class);
        Display display = new Display(printStream);
        display.print("Maharjun");

        verify(printStream, times(1)).println("Maharjun");
    }
}
