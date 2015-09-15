package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldReturnFalseWhenUserIsNotEquals() {
        User user = new User("B09-1893","B091893");

        assertFalse(user.compare("maharjun","B091893"));
    }
}
