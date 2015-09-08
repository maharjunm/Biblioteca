package com.twu.biblioteca;

import java.util.Scanner;

public class UserInput {

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
