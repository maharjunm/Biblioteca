package com.twu.biblioteca;

public class Display {

    private final String output;

    public Display(String output) {
        this.output = output;
    }

    public void print() {
        System.out.println(output);
    }
}
