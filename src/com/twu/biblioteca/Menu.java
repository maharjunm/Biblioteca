package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private String[] options = {"List Books"};

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < options.length; i++) {
            output += (i + 1) + "." + options[i] + "\n";
        }
        return output;
    }
}
