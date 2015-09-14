package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DisplayTest {

    @Test
    public void shouldPrintTheString() {
        Display display = mock(Display.class);
        display.print("Maharjun");

        verify(display, times(1)).print("Maharjun");
    }
}
