//User has name
package com.twu.biblioteca;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
