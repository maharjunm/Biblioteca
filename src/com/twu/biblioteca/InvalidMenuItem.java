package com.twu.biblioteca;

public class InvalidMenuItem {

    private Display display;

    public InvalidMenuItem(Display display) {
        this.display = display;
    }

    public void execute() {
        display.print("Invalid Option");
    }
}
