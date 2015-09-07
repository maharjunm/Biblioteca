package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }

    public void start() {
        new Display("Welcome To Biblioteca").print();
        Menu menu = new Menu();
        new Display(menu.toString()).print();
        new Display("Choose Any One Option :").print();
    }
}
