package com.twu.biblioteca;

public class UserMenu implements Menu {

    String[] options = {"List Books", "List Movies", "Checkout Movie", "Checkout Book", "Return Book", "Logout", "Quit"};

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < options.length; i++) {
            result += (i + 1) + "." + options[i] + "\n";
        }
        return result.substring(0, result.length() - 1);
    }
}
