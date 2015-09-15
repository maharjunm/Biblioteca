//User has name
package com.twu.biblioteca;

public class User {
    private String email;
    private String name;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + "\t" + email;
    }
}
