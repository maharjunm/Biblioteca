package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public void printOptions() {
        System.out.println("1.List Books");
        System.out.print("Choose one Option :");
        Scanner scanner = new Scanner(System.in);
        String option=scanner.nextLine();

        processUserOption(option);
    }

    private void processUserOption(String option) {
        if(option.equals("1")){
            List<Book> list = new ArrayList<>();
            list.add(new Book("Head First Java", "Kathy Sierra", 2009));
            Books books = new Books(list);
            books.printBooks();
        }
    }
}
