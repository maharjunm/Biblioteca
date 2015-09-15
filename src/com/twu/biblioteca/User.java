//User has name
package com.twu.biblioteca;

public class User {

    private String password;
    private String loginId;

    public User(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    public boolean compare(String loginId, String password) {
        return false;
    }
}
