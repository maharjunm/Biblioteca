package com.twu.biblioteca;

import java.io.PrintStream;

public class Display {

    private PrintStream printStream;

    public Display(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void print(String output) {
        printStream.println(output);
    }
}
