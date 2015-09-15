package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void shouldReturnTheUserName() {
        User user = new User("Maharjun", "maharjun@thoughtworks.com");

        Assert.assertEquals("Maharjun",user.toString());
    }

    @Test
    public void shouldReturnTheEmailAddress() {
        User user = new User("Maharjun","maharjun@thoughtworks.com");

        Assert.assertEquals("Maharjun\tmaharjun@thoughtworks.com",user.toString());
    }
}
