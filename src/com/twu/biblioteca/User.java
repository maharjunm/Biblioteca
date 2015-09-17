//User has name
package com.twu.biblioteca;

public class User {

    private String name;
    private String password;
    private String loginId;
    private String role;

    public User(String loginId, String password, String role, String name) {
        this.loginId = loginId;
        this.password = password;
        this.role = role;
        this.name = name;
    }

    public boolean compare(String loginId, String password) {
        if (this.loginId.equals(loginId) && this.password.equals(password))
            return true;
        return false;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString(){
        return name;
    }
}
