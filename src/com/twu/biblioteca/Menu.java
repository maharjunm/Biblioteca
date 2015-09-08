package com.twu.biblioteca;

public class Menu {
    private String[] options = {"List Books","Checkout Book","Return Book"};

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < options.length; i++) {
            output += (i + 1) + "." + options[i] + "\n";
        }
        return output.substring(0,output.length()-1);
    }
}
