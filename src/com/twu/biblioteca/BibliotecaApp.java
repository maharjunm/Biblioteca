package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
    }

    public void start() {
        printWelcomeMessage("Welcome To Biblioteca");
    }

    private void printWelcomeMessage(String welcomeMessage) {
        System.out.println(welcomeMessage);
    }
}
