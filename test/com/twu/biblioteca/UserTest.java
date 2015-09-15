package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void shouldReturnTheUserName() {
        User user = new User("Maharjun");

        Assert.assertEquals("Maharjun",user.toString());
    }
}
