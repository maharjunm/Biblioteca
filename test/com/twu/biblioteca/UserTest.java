package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void shouldReturnTheUserName() {
        User user = new User("Maharjun", "maharjun@thoughtworks.com", "+918498984842");

        Assert.assertEquals("Maharjun\tmaharjun@thoughtworks.com\t+918498984842",user.toString());
    }

    @Test
    public void shouldReturnTheEmailAddress() {
        User user = new User("Maharjun","maharjun@thoughtworks.com", "+918498984842");

        Assert.assertEquals("Maharjun\tmaharjun@thoughtworks.com\t+918498984842",user.toString());
    }

    @Test
    public void shouldReturnThePhoneNumber() {
        User user = new User("Maharjun","maharjun@thoughtworks.com","+918498984842");

        Assert.assertEquals("Maharjun\tmaharjun@thoughtworks.com\t+918498984842",user.toString());
    }
}
