package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class InvalidMenuItemTest {

    @Test
    public void shouldPrintTheInvalidOption() {
        Display display = mock(Display.class);
        InvalidMenuItem menuItem = new InvalidMenuItem(display);

        menuItem.execute();

        verify(display,times(1)).print("Invalid Option");
    }
}
