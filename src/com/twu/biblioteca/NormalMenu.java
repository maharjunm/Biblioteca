// Menu has some options and it will return that options
package com.twu.biblioteca;

public class NormalMenu {
    private String[] options = {"List Books", "List Movies", "Checkout Movie", "Login", "Quit"};

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < options.length; i++) {
            output += (i + 1) + "." + options[i] + "\n";
        }
        return output.substring(0, output.length() - 1);
    }

    public String userOptions() {
        String[] userOptions = {"List Books", "List Movies", "Checkout Movie", "Checkout Book", "Return Book", "Quit"};
        String result = "";
        for (int i = 0; i < userOptions.length; i++) {
            result += (i + 1) + "." + userOptions[i] + "\n";
        }
        return result.substring(0,result.length()-1);
    }
}
