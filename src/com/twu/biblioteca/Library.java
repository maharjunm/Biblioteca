//Library has list of books
package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    private ArrayList books = new ArrayList<Book>() {{
        add(new Book("Head First Java", "Bert Bates", 2009));
    }};

    @Override
    public String toString() {
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "____________________________________________________________________";
        String output = line + "\n" + header + "\n" + line + "\n";
        for (int i = 0; i < books.size(); i++) {
            output += books.get(i) + "\n";
        }
        return output.substring(0,output.length()-1);
    }
}
