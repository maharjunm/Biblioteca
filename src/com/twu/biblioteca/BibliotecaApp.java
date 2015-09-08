package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }

    public void start() {
        new Display("Welcome To Biblioteca").print();
        while (true) {
            Menu menu = new Menu();
            new Display(menu.toString()).print();
            new Display("Choose Any One Option :").print();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("1")) {
                Library library = new Library();
                new Display(library.toString()).print();
            } else {
                new Display("Select a valid option!").print();
            }
        }
    }
}
