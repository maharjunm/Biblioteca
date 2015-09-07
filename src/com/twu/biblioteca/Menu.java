package com.twu.biblioteca;

public class Menu {
    private String[] options = {"List Books"};

    public void showOptions() {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "." + options[i]);
        }
    }
}
