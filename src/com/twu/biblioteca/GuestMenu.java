// Menu has some options and it will return that options
package com.twu.biblioteca;

public class GuestMenu implements Menu {
    private String[] options = {"List Books", "List Movies", "Checkout Movie", "Login", "Quit"};

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < options.length; i++) {
            output += (i + 1) + "." + options[i] + "\n";
        }
        return output.substring(0, output.length() - 1);
    }
}
