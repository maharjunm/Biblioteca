package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldReturnFalseWhenUserNameIsNotEquals() {
        User user = new User("B09-1893", "B091893", "Librarian", "Maharjun", "maharjun123@gmail.com", "8498984842");

        assertFalse(user.compare("maharjun", "B091893"));
    }

    @Test
    public void shouldReturnFalseWhenPasswordIsNotEquals() {
        User user = new User("B09-1893", "B091893", "Librarian", "Maharjun", "maharjun123@gmail.com", "8498984842");

        assertFalse(user.compare("B09-1893", "maharjun"));
    }

    @Test
    public void shouldReturnTrueWhenBothEquals() {
        User user = new User("B09-1893", "B091893", "Librarian", "Maharjun", "maharjun123@gmail.com", "8498984842");

        assertTrue(user.compare("B09-1893", "B091893"));
    }

    @Test
    public void shouldReturnTheRoleOfTheUser() {
        User user = new User("B09-1893", "B091893", "Librarian", "Maharjun", "maharjun123@gmail.com", "8498984842");

        assertEquals("Librarian", user.getRole());
    }

    @Test
    public void shouldReturnNameOfTheUser() {
        User user = new User("B09-1893", "B091893", "Librarian", "Maharjun", "maharjun123@gmail.com", "8498984842");

        assertEquals("Maharjun\tmaharjun123@gmail.com\t8498984842", user.toString());
    }

    @Test
    public void shouldReturnEmailOfTheUser() {
        User user = new User("B09-1893", "B091893", "Librarian", "Maharjun", "maharjun123@gmail.com", "8498984842");

        assertEquals("Maharjun\tmaharjun123@gmail.com\t8498984842", user.toString());
    }

    @Test
    public void shouldReturnPhoneNumberOfTheUser() {
        User user = new User("B09-1893", "B091893", "Librarian", "Maharjun", "maharjun123@gmail.com", "8498984842");

        assertEquals("Maharjun\tmaharjun123@gmail.com\t8498984842", user.toString());
    }
}
