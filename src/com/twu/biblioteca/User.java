//User has name
package com.twu.biblioteca;

public class User {
    private String email;
    private String name;
    private String phoneNumber;

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + "\t" + email + "\t" + phoneNumber;
    }
}
