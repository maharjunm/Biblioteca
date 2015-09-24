package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class CheckOutMovieMenuItemTest {

    @Test
    public void shouldRetutnTheOption() {
        CheckOutMovieMenuItem menuItem = new CheckOutMovieMenuItem();

        Assert.assertEquals("Checkout Movie", menuItem.option());
    }
}
