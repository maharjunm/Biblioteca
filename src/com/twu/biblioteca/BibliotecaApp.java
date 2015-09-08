package com.twu.biblioteca;

public class BibliotecaApp {

    private UserInput userInput;
    private Menu menu;
    private Display display;
    private Library library;

    public BibliotecaApp(Library library, Display display, Menu menu, UserInput userInput) {
        this.library = library;
        this.display = display;
        this.menu = menu;
        this.userInput = userInput;
    }

    public static void main(String[] args) {
    }

    public void start() {
        display.print("Welcome to Biblioteca");
        showOptions();
        chooseOption();
    }

    private void chooseOption() {
        display.print("Choose Any One Option :");
        String input = userInput.getInput();
        if(input.equals("1")){
            display.print(library.toString());
        }else {
            display.print("Select a valid option!");
        }
    }

    public void showOptions() {
        String menuOptions = menu.toString();
        display.print(menuOptions);
    }
}
