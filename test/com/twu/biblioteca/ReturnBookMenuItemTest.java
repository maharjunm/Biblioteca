package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class ReturnBookMenuItemTest {

    @Test
    public void shouldReturnTheOption() {
        ReturnBookMenuItem returnBookMenuItem = new ReturnBookMenuItem();

        Assert.assertEquals("Return Book", returnBookMenuItem.option());
    }
}
